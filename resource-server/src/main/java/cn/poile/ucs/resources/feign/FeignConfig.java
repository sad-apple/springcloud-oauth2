package cn.poile.ucs.resources.feign;

import feign.RequestInterceptor;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.security.oauth2.client.feign.OAuth2FeignRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.client.DefaultOAuth2ClientContext;
import org.springframework.security.oauth2.client.token.grant.client.ClientCredentialsResourceDetails;

import java.io.IOException;

/**
 * @Author：zhang shi ping
 * @Date：Created in 10:26 2021/6/25
 * @Description：
 * @ModifiedBy：
 * @Version:
 */
@EnableFeignClients
@Configuration
public class FeignConfig {
    @Bean
    public RequestInterceptor getOAuth2RequestInterceptor() throws IOException {
        return new OAuth2FeignRequestInterceptor(new DefaultOAuth2ClientContext(), new ClientCredentialsResourceDetails());
    }

}
