package io.github.ieu.jst;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DefaultJstBizDigestTest {
    @Test
    void sign_shouldGenerateCorrectSignature() {
        JstCredential credential = new JstCredential("5b53060f23d84ddf9703056e84fa5a2d", "e9c5ca33fecb404b8e6cdbd0ef4a6d25");
        DefaultJstBizDigest digest = new DefaultJstBizDigest(credential);
        JstBizRequest request = new JstBizRequest()
                .setAppKey(credential.getAppKey())
                .setAccessToken("d7b01bf0842a4742a9450e21ffd95f60")
                .setTimestamp(Long.toString(1639128407))
                .setBiz("{\"page_index\":\"1\",\"page_size\":\"100\",\"nicks\":[\"老板\"]}");
        digest.sign(request);
        assertEquals("395f5a78b446be465ac03a02491296c7", request.getSign());
    }
}