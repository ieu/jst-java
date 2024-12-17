package io.github.ieu.jst.http;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class DefaultJstResponseEntity<T> implements JstResponseEntity<T> {
    private int statusCode;
    private JstHttpHeaders headers;
    private T body;
}
