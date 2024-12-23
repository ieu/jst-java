package io.github.ieu.jst;

import io.github.ieu.jst.auth.JstAccessTokenRequest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DefaultJstDigestTest {

    @Test
    void sign_shouldGenerateCorrectSignatureWhenJstAccessTokenRequestPassedIn() {
        JstCredential credential = new JstCredential("5b53060f23d84ddf9703056e84fa5a2d", "e9c5ca33fecb404b8e6cdbd0ef4a6d25");
        DefaultJstDigest digest = new DefaultJstDigest(credential);
        JstAccessTokenRequest request = new JstAccessTokenRequest()
                .setAppKey(credential.getAppKey())
                .setTimestamp(Long.toString(1639128407))
                .setCode("123456");
        request.setSign(digest.sign(request));
        assertEquals("05e3a51e19e0883afd1882ccd309e0b9", request.getSign());
    }

    @Test
    void sign_shouldGenerateCorrectSignatureWhenJstBizRequestPassedIn() {
        JstCredential credential = new JstCredential("5b53060f23d84ddf9703056e84fa5a2d", "e9c5ca33fecb404b8e6cdbd0ef4a6d25");
        DefaultJstDigest digest = new DefaultJstDigest(credential);
        JstBizRequest request = new JstBizRequest()
                .setAppKey(credential.getAppKey())
                .setAccessToken("d7b01bf0842a4742a9450e21ffd95f60")
                .setTimestamp(Long.toString(1639128407))
                .setBiz("{\"page_index\":\"1\",\"page_size\":\"100\",\"nicks\":[\"老板\"]}");
        request.setSign(digest.sign(request));
        assertEquals("395f5a78b446be465ac03a02491296c7", request.getSign());
    }
}