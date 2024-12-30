package io.github.ieu.jst.type;

import lombok.experimental.UtilityClass;

import java.lang.reflect.*;

@UtilityClass
public class TypeFactory {

    public Class<?> rawClass(Type type) {
        if (type instanceof Class<?>) {
            return (Class<?>) type;
        } else if (type instanceof GenericArrayType) {
            return Array.newInstance(rawClass(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        } else if (type instanceof ParameterizedType) {
            return rawClass(((ParameterizedType) type).getRawType());
        } else if (type instanceof TypeVariable<?>) {
            return rawClass(((TypeVariable<?>) type).getBounds()[0]);
        } else if (type instanceof WildcardType) {
            return rawClass(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new ClassCastException(String.format("Cannot get raw type of %s", type));
    }
}
