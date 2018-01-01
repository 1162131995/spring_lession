package cn.et.lesson04.jdbc;



import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import cn.et.lesson04.jdbc.dao.MyMoneyDao;


public class Test2 {
	static MyMoneyDao myMoneyDao;
	static{
		ApplicationContext context = new GenericXmlApplicationContext("classpath:/cn/et/lesson04/jdbc/spring.xml");
		myMoneyDao = (MyMoneyDao)context.getBean("myMoneyDaoImpl");
	}
	
	public static void main(String[] args) throws SQLException {
		myMoneyDao.updateaMinus(10);
	}
}
