package cn.et.lesson01.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("cn/et/lesson01/test/spring.xml");
		A a = (A)context.getBean("a");
		System.out.println(a);
		
//		//����ͨ��������ȡʵ�������xml�ļ����ж�������bean���׳��쳣
//		A a1 = context.getBean(A.class);
//		System.out.println(a1);
//		
		//��ȡ����bean��id
		String [] beans = context.getBeanDefinitionNames();
		for(String bean:beans){
			System.out.println(bean);
		}
		
		C c = (C)context.getBean("c");
		System.out.println(c.getAge());
		System.out.println(c.getName());
		System.out.println(c.getA());
		
		
	}
}