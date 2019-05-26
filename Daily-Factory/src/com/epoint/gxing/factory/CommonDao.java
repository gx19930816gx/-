package com.epoint.gxing.factory;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * 抽象接口，完成增删改查
 * 
 * @author GX
 *
 */
public class CommonDao implements ImplCommonDao{

	private Session session;
	Transaction transaction;

	public CommonDao(Session session) {
		this.session = session;
		this.transaction = session.getTransaction();
	}
	@Override
	// 增
	public boolean insert(Object record) {
		try {
			transaction.begin();
			session.save(record);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	@Override
	// 删
	public boolean delete(Object record) {
		try {
			transaction.begin();
			session.delete(record);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;

	}
	@Override
	// 改
	public boolean update(Object record) {
		try {
			transaction.begin();
			session.update(record);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	@Override
	// 查
	public Object find(String RowGuid,Class<?> classname){
		try {
	      Object ret = session.get(classname, RowGuid);
	      return ret;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	@Override
	// 关闭连接
	public void close() {
		session.close();
	}
}
