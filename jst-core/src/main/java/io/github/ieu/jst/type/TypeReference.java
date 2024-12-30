package io.github.ieu.jst.type;

import lombok.Getter;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

@Getter
public abstract class TypeReference<T> {
    protected final Type type;

    protected TypeReference() {
        Type superClass = getClass().getGenericSuperclass();
        type = ((ParameterizedType) superClass).getActualTypeArguments()[0];
    }
}
