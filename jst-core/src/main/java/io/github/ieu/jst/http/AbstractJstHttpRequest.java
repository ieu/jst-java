package io.github.ieu.jst.http;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class AbstractJstHttpRequest implements JstHttpRequest {
    private JstMediaType contentType;
}
