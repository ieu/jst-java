package io.github.ieu.jst.http.converter;

import io.github.ieu.jst.JstConvention;
import io.github.ieu.jst.http.JstHttpInputMessage;
import io.github.ieu.jst.http.JstHttpMessageConverter;
import io.github.ieu.jst.http.JstHttpOutputMessage;
import io.github.ieu.jst.http.JstMediaType;
import lombok.SneakyThrows;

import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SimpleUrlEncodedFormJstHttpMessageConverter<T> implements JstHttpMessageConverter<T> {

    @Override
    public boolean canRead(Class<?> clazz, JstMediaType contentType) {
        return false;
    }

    @Override
    public T read(Class<?> clazz, JstHttpInputMessage message) throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean canWrite(Class<?> clazz, JstMediaType contentType) {
        if (!JstMediaType.APPLICATION_FORM_URLENCODED.equals(contentType)) {
            return false;
        }

        if (clazz.isInterface()) {
            return false;
        }

        if (clazz.isAnnotation()) {
            return false;
        }

        if (clazz.isArray()) {
            return false;
        }

        if (Enum.class.isAssignableFrom(clazz)) {
            return false;
        }

        if (clazz.isPrimitive()) {
            return false;
        }

        return true;
    }

    @Override
    public void write(T value, JstHttpOutputMessage message) throws IOException {
        Map<String, String> params = collectProperties(value);
        String encodedParams = params.entrySet()
                .stream()
                .filter(e -> {
                    String v = e.getValue();
                    return v != null;
                })
                .map(new Function<Map.Entry<String, String>, String>() {
                    @Override
                    @SneakyThrows
                    public String apply(Map.Entry<String, String> entry) {
                        String k = entry.getKey();
                        String v = URLEncoder.encode(entry.getValue(), JstConvention.DEFAULT_CHARSET.name());
                        return k + "=" + v;
                    }
                })
                .collect(Collectors.joining("&"));
        message.getBody().write(encodedParams.getBytes(JstConvention.DEFAULT_CHARSET));
    }

    @SneakyThrows
    protected Map<String, String> collectProperties(Object value) {
        Class<?> valueType = value.getClass();
        Map<String, String> properties = new HashMap<>();
        Method[] methods = valueType.getDeclaredMethods();
        for (Method method : methods) {
            String methodName = method.getName();
            if (methodName.startsWith("get") && methodName.length() > 3) {
                String fieldName = translateFieldName(methodName.substring(3));
                String fieldValue = Objects.toString(method.invoke(value));
                properties.put(fieldName, fieldValue);
            } else if (methodName.startsWith("is") && methodName.length() > 2) {
                String formName = translateFieldName(methodName.substring(2));
                String formValue = Objects.toString(method.invoke(value));
                properties.put(formName, formValue);
            }
        }
        return properties;
    }

    protected String translateFieldName(String fieldName) {
        StringBuilder buffer = new StringBuilder(fieldName.length() * 2);
        for (int i = 0; i < fieldName.length(); ++i) {
            char ch = fieldName.charAt(i);
            if (Character.isUpperCase(ch)) {
                if (i != 0) {
                    buffer.append("_");
                }
                buffer.append(Character.toLowerCase(ch));
            } else {
                buffer.append(ch);
            }
        }
        return buffer.toString();
    }
}
