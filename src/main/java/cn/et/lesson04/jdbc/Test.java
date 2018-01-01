package cn.et.lesson04.jdbc;
import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class Test {
	static DataSource dataSource;
	static Connection connection;
	static{
		ConfigurableApplicationContext context = new GenericXmlApplicationContext("classpath:/cn/et/lesson04/jdbc/spring.xml");
		dataSource = (DataSource)context.getBean("dataSource");
	}
	
	public static void main(String[] args) throws SQLException {
		try {
			//前置通知
			connection = dataSource.getConnection();
			connection.setAutoCommit(false);
			
			aMinus(10);
			bAdd(10);
			
			//后置通知
			connection.commit();
		} catch (Exception e) {
			// TODO: handle exception
			connection.rollback();
		}finally {
			connection.close();
		}
		
	}
	public static void aMinus(int money) throws SQLException{
		String sql = "update mymoney set money=money-"+money+" where username='a'";
		connection.prepareStatement(sql).executeUpdate();
	}
	public static void bAdd(int money) throws SQLException{
		String sql = "update mymoney set money=money+"+money+" where username='b'";
		connection.prepareStatement(sql).executeUpdate();
	}
}
