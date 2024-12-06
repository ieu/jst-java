package io.github.ieu.jst;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JstCredential {
    private String appKey;
    private String appSecret;
}
