package com.epoint.gxing.factory;

import java.util.UUID;

public class HibernateText {
	/**
	 * ����֤һ�����ӳع�����
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// ��ʼ��һ���ҵĹ���
		CommonDaoFactory.init();
		// ð���׼����һ��service
		ImplCommonDao service = CommonDaoFactory.CreateDao();
		
		// ����һ��User��
		User user1 = new User();
		user1.setId("97f57449-9e73-40b1-885c-523649c89869");
		user1.setPassword("111111");
		user1.setCellphone("13160209527");
		user1.setUsername("����");
		
		User user2 = new User();
		user2.setId(UUID.randomUUID().toString());
		user2.setPassword("11111");
		user2.setCellphone("13160209527");
		user2.setUsername("����");
		//��
		//service.insert(user1);
		//service.insert(user2);
		//ɾ
		//service.delete(user1);
		//��
		//service.update(user1);
		//��
		User ret =(User)service.find("97f57449-9e73-40b1-885c-523649c89869", User.class);
		System.out.println(ret.getUsername());
		service.close();
	}
}
