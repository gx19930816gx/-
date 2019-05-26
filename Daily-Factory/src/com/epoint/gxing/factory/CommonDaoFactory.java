package com.epoint.gxing.factory;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

/**
 * 连接池工厂
 * @author GX
 *
 */
public class CommonDaoFactory {
	private final static Configuration configuration= new Configuration();
	
	//初始化我的连接池工厂
	public static void init(){
        configuration.configure("com/epoint/gxing/factory/hibernate.cfg.xml");
	}

	//从连接池中取个连接出来给业务用
	public static ImplCommonDao CreateDao(){		
        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();
        ImplCommonDao dao = new CommonDao(session);
        return dao;
	}
}
