package cn.et.lesson02;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import cn.et.lesson02.controller.MyController;

public class MyView {
	private static ConfigurableApplicationContext context;
	private static MyController controller;
	static{
		context = new GenericXmlApplicationContext("classpath:cn/et/lesson02/spring.xml");
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		try {
			while(true){
				System.out.println("«Î ‰»Îsql”Ôæ‰");
				controller = (MyController)context.getBean("myController");
				String sql = scanner.nextLine();
				controller.service(sql);
			}
		} finally {
			context.close();
		}
	}
}
