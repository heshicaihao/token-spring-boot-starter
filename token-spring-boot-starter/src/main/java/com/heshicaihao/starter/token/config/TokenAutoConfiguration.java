package com.heshicaihao.starter.token.config;


import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * 设置自动装配类
 * heshicaihao
 * 20300531
 *
 */
@Configuration
public class TokenAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean(TokenDecode.class)
    public TokenDecode tokenDecode(){
        return new TokenDecode();
    }

}
