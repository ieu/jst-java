package io.github.ieu.jst.auth;

import io.github.ieu.jst.JstCredential;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DefaultJstAuthDigestTest {
    @Test
    void sign_shouldGenerateCorrectSignature() {
        JstCredential credential = new JstCredential("5b53060f23d84ddf9703056e84fa5a2d", "e9c5ca33fecb404b8e6cdbd0ef4a6d25");
        DefaultJstAuthDigest digest = new DefaultJstAuthDigest(credential);
        JstAccessTokenRequest request = new JstAccessTokenRequest()
                .setAppKey(credential.getAppKey())
                .setTimestamp(Long.toString(1639128407))
                .setCode("123456");
        digest.sign(request);
        assertEquals("05e3a51e19e0883afd1882ccd309e0b9", request.getSign());
    }
}