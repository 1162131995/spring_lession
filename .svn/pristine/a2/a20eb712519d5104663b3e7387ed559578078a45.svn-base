package cn.et.lesson02.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.et.lesson02.dao.MyDao;

@Service
public class MyService {
	@Autowired
	private MyDao dao;
	public String query(String sql){
		return dao.query(sql).toString();
	}
}
