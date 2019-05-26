package com.epoint.gxing.factory;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

/**
 * ���ӳع���
 * @author GX
 *
 */
public class CommonDaoFactory {
	private final static Configuration configuration= new Configuration();
	
	//��ʼ���ҵ����ӳع���
	public static void init(){
        configuration.configure("com/epoint/gxing/factory/hibernate.cfg.xml");
	}

	//�����ӳ���ȡ�����ӳ�����ҵ����
	public static ImplCommonDao CreateDao(){		
        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();
        ImplCommonDao dao = new CommonDao(session);
        return dao;
	}
}
