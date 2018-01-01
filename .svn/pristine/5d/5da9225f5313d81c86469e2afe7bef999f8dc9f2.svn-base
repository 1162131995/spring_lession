package cn.et.lesson03.java;

import java.lang.reflect.Proxy;


public class Test {
	public static void main(String[] args) {
		AfHouseOwner ho = new AfHouseOwner();
		HousePoint hp = new HousePoint(ho);
		HouseOwner h = (HouseOwner)Proxy.newProxyInstance(ho.getClass().getClassLoader(), ho.getClass().getInterfaces(), hp);
		h.seekHouse();
	}
}
