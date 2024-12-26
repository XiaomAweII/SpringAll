package com.springboot.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class BlogProperties {

	/**
	 * 通过 @Value("${属性名}") 来加载配置文件中的属性值
	 */
	@Value("${mrbird.blog.name}")
	private String name;
	
	@Value("${mrbird.blog.title}")
	private String title;
	
}
