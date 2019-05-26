package com.epoint.gxing.factory;
/**
 * 将连接对象抽象出来
 * 最基本的要实现增删改查
 * @author GX
 *
 */
public interface ImplCommonDao {
	//增
	public boolean insert(Object r);
	//删
	public boolean delete(Object r);
	//改
	public boolean update(Object r);
	//查
	public Object find(String RowGuid,Class<?> classname);
	//关闭连接
	public void close();
	
}
