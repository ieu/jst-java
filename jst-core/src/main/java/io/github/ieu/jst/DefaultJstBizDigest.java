package io.github.ieu.jst;

import org.apache.commons.codec.digest.DigestUtils;

import java.util.Map;
import java.util.TreeMap;

public class DefaultJstBizDigest implements JstBizDigest {
    private final JstCredential credential;

    public DefaultJstBizDigest(JstCredential credential) {
        this.credential = credential;
    }

    @Override
    public void sign(JstBizRequest request) {
        Map<String, String> params = new TreeMap<>();
        params.put("access_token", request.getAccessToken());
        params.put("app_key", request.getAppKey());
        params.put("biz", request.getBiz());
        params.put("charset", request.getCharset());
        params.put("timestamp", request.getTimestamp());
        params.put("version", request.getVersion());
        String paramString = params.entrySet().stream()
                .collect(
                        () -> new StringBuilder(credential.getAppSecret()),
                        (sb, entry) -> sb.append(entry.getKey()).append(entry.getValue()),
                        StringBuilder::append
                )
                .toString();
        String sign = DigestUtils.md5Hex(paramString);
        request.setSign(sign);
    }
}
