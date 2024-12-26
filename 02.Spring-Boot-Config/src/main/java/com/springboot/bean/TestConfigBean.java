package com.springboot.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Configuration
@ConfigurationProperties(prefix="test")
/**
 * 自定义配置文件需要使用 @PropertySource("classpath:test.properties") 指明使用了哪个配置文件
 * 要使用该配置文件，同样需要在入口类里使用注解 @EnableConfigurationProperties({TestConfigBean.class})
 */
@PropertySource("classpath:test.properties")
@Component
@Data
public class TestConfigBean {
	private String name;
	private int age;
}
