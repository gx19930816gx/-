package com.epoint.gxtext;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class HibernateText
{
/**
 * hibernate测试类
 *  [一句话功能简述]
 *  [功能详细描述]
 *  @param args
 */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
      //创建对象
        User user = new User();
        user.setId("8a8a66d56a1b4187016a1b4188e20000");
        user.setPassword("woaihxw1314");
        user.setCellphone("13160209527");
        user.setUsername("顾兴_2");
        Configuration configuration = new Configuration();
        configuration.configure("com/epoint/gxtext/hibernate.cfg.xml");
        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.getTransaction();
        transaction.begin();
/*        session.save(user);
        transaction.commit();
        session.close();*/
        
        transaction.begin();
        session.update(user);
        transaction.commit();
        session.close();
        
        
    }

}
