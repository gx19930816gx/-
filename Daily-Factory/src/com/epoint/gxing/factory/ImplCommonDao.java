package com.epoint.gxing.factory;
/**
 * �����Ӷ���������
 * �������Ҫʵ����ɾ�Ĳ�
 * @author GX
 *
 */
public interface ImplCommonDao {
	//��
	public boolean insert(Object r);
	//ɾ
	public boolean delete(Object r);
	//��
	public boolean update(Object r);
	//��
	public Object find(String RowGuid,Class<?> classname);
	//�ر�����
	public void close();
	
}
