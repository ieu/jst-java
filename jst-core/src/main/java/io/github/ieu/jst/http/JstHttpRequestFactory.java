package io.github.ieu.jst.http;

import java.net.URI;

@FunctionalInterface
public interface JstHttpRequestFactory {
    JstHttpRequest create(URI uri, JstHttpMethod method);

    default JstHttpRequest get(URI uri) {
        return create(uri, JstHttpMethod.GET);
    }

    default JstHttpRequest head(URI uri) {
        return create(uri, JstHttpMethod.HEAD);
    }

    default JstHttpRequest post(URI uri) {
        return create(uri, JstHttpMethod.POST);
    }

    default JstHttpRequest put(URI uri) {
        return create(uri, JstHttpMethod.PUT);
    }

    default JstHttpRequest patch(URI uri) {
        return create(uri, JstHttpMethod.PATCH);
    }

    default JstHttpRequest delete(URI uri) {
        return create(uri, JstHttpMethod.DELETE);
    }

    default JstHttpRequest options(URI uri) {
        return create(uri, JstHttpMethod.OPTIONS);
    }

    default JstHttpRequest trace(URI uri) {
        return create(uri, JstHttpMethod.TRACE);
    }
}
