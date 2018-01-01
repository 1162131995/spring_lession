package cn.et.lesson04.jdbc.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import cn.et.lesson04.jdbc.dao.MyMoneyDao;

@Repository
public class MyMoneyDaoImpl implements MyMoneyDao {
	@Autowired
	JdbcTemplate jdbc ;
	public void updateaMinus(int money){
		String sql = "update mymoney set money=money-"+money+" where username='a'";
		jdbc.execute(sql);int i = 5/0;
		updateAdd(money);
		
	}
	public void updateAdd(int money){
		String sql = "update mymoney set money=money+"+money+" where username='b'";
		jdbc.execute(sql);
	}

}
