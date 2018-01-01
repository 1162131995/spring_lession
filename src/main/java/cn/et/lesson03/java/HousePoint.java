package cn.et.lesson03.java;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class HousePoint implements InvocationHandler {
	HouseOwner house = null;
	public HousePoint(HouseOwner house){
		this.house=house;
	}
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object obj = null;
		System.out.println("ǰ��֪ͨ");
		obj = method.invoke(house, args);
		System.out.println("����֪ͨ");
		return obj;
	}

}
