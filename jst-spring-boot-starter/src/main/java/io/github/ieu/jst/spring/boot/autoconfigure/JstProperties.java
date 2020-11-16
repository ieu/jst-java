package io.github.ieu.jst.spring.boot.autoconfigure;

import io.github.ieu.jst.JstEnvironment;
import lombok.Data;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.util.Assert;

@Data
@ConfigurationProperties(prefix = JstProperties.JST_PREFIX)
public class JstProperties implements InitializingBean {
    public static final String JST_PREFIX = "jst";

    private String partnerId;

    private String partnerKey;

    private String token;

    private JstEnvironment env = JstEnvironment.PRODUCTION;

    @Override
    public void afterPropertiesSet() throws Exception {
        Assert.hasText(partnerId, "partnerId can not be empty");
        Assert.hasText(partnerKey, "partnerKey can not be empty");
        Assert.hasText(token, "token can not be empty");
    }
}
