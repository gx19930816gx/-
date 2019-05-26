package com.epoint.gxing.factory;

import java.util.UUID;

public class HibernateText {
	/**
	 * 来验证一波连接池工厂把
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// 初始化一下我的工厂
		CommonDaoFactory.init();
		// 冒充标准版来一个service
		ImplCommonDao service = CommonDaoFactory.CreateDao();
		
		// 定义一个User类
		User user1 = new User();
		user1.setId("97f57449-9e73-40b1-885c-523649c89869");
		user1.setPassword("111111");
		user1.setCellphone("13160209527");
		user1.setUsername("顾兴");
		
		User user2 = new User();
		user2.setId(UUID.randomUUID().toString());
		user2.setPassword("11111");
		user2.setCellphone("13160209527");
		user2.setUsername("左龙");
		//增
		//service.insert(user1);
		//service.insert(user2);
		//删
		//service.delete(user1);
		//改
		//service.update(user1);
		//查
		User ret =(User)service.find("97f57449-9e73-40b1-885c-523649c89869", User.class);
		System.out.println(ret.getUsername());
		service.close();
	}
}
