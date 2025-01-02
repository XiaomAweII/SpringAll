package com.springboot.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.bean.Student;
import com.springboot.service.StudentService;

@RestController
public class TestController {

	@Autowired
	private StudentService studentService;

	// @RequestMapping注解当中的第二个参数method=RequestMethod.GET指定这个方法所处理的HTTP请求类型
	// method 参数用来限定该方法可以相应的HTTP请求方法
	// RequestMethod.GET 是一个枚举值，表示该方法只处理HTTP GET请求
	@RequestMapping(value = "/querystudent", method = RequestMethod.GET)
	public Student queryStudentBySno(String sno) {
		return this.studentService.queryStudentBySno(sno);
	}

	@RequestMapping(value = "/queryallstudent")
	public List<Map<String, Object>> queryAllStudent() {
		return this.studentService.queryStudentListMap();
	}
	
	@RequestMapping(value = "/addstudent", method = RequestMethod.GET)
	public int saveStudent(@RequestParam("sno") String sno,@RequestParam("name") String name,@RequestParam("sex") String sex) {
		Student student = new Student();
		student.setSno(sno);
		student.setName(name);
		student.setSex(sex);
		return this.studentService.add(student);
	}
	
	@RequestMapping(value = "deletestudent", method = RequestMethod.GET)
	public int deleteStudentBySno(String sno) {
		return this.studentService.deleteBysno(sno);
	}
}
