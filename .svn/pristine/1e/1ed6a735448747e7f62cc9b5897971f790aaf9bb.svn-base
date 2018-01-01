package cn.et.lesson01;

import java.sql.Connection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("cn/et/lesson01/spring.xml");

//		DriverManagerDataSource dmds = (DriverManagerDataSource)context.getBean("dataSource");
		Connection connection = (Connection) context.getBean("connection");	
		System.out.println(connection);
	}

}
