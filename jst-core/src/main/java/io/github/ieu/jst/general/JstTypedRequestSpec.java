package io.github.ieu.jst.general;

import io.github.ieu.jst.type.TypeReference;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class JstTypedRequestSpec<T> {

    private final JstGeneralClient client;

    private ParamBuilder<T> paramBuilder;

    @Getter
    @Setter
    @Accessors(fluent = true, chain = true)
    private String path;

    public JstTypedRequestSpec(JstGeneralClient client) {
        this.client = client;
    }

    public JstTypedRequestSpec<T> param(T param) {
        this.paramBuilder = new ParamBuilder<>(() -> param);
        return this;
    }

    public JstTypedRequestSpec<T> param(Supplier<T> paramSupplier) {
        this.paramBuilder = new ParamBuilder<>(paramSupplier);
        return this;
    }

    public <U> JstTypedRequestSpec<T> param(BiConsumer<T, U> setter, U value) {
        this.paramBuilder.set(setter, value);
        return this;
    }

    public <R> R response(Class<R> clazz) {
        return this.client.request(path, paramBuilder.build(), clazz);
    }

    public <R> R response(TypeReference<R> typeReference) {
        return this.client.request(path, paramBuilder.build(), typeReference);
    }

    public static class ParamBuilder<T> {

        private final Supplier<T> supplier;

        private final Collection<Consumer<T>> setters = new ArrayList<>();

        public ParamBuilder(Supplier<T> supplier) {
            this.supplier = supplier;
        }

        public <U> ParamBuilder<T> set(BiConsumer<T, U> setter, U value) {
            setters.add(object -> setter.accept(object, value));
            return this;
        }

        public T build() {
            T object = supplier.get();
            if (object == null) {
                return null;
            }
            setters.forEach(consumer -> consumer.accept(object));
            return object;
        }
    }
}
