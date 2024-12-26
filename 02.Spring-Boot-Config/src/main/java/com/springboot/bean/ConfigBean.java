package com.springboot.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix="mrbird.blog")// 指明属性的通用前缀
public class ConfigBean {
	private String name;
	private String title;
	private String wholeTitle;
}
