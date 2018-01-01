package cn.et.lesson02.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import cn.et.lesson02.service.MyService;

@Controller
public class MyController {
	@Autowired
	private MyService service;
	public void service(String sql){
		System.out.println(service.query(sql));
	}
}
