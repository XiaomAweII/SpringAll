package com.springboot.bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class Student implements Serializable{
	// 当我们实现了Serializable接口时，建议显式声明 serialVersionUID 字段。这是为了确保类的序列化和反序列化过程的一致性
	private static final long serialVersionUID = -339516038496531943L;
	private String sno;
	private String name;
	private String sex;
}
