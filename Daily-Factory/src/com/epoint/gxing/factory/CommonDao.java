package com.epoint.gxing.factory;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * ����ӿڣ������ɾ�Ĳ�
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
	// ��
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
	// ɾ
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
	// ��
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
	// ��
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
	// �ر�����
	public void close() {
		session.close();
	}
}
