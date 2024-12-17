package io.github.ieu.jst.http;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.net.URI;

@Getter
@Setter
@Accessors(chain = true)
public class DefaultJstRequestEntity<T> implements JstRequestEntity<T> {
    private JstHttpMethod method;
    private URI uri;
    private JstHttpHeaders headers;
    private T body;
}
