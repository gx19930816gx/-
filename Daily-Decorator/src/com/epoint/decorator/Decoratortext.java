package com.epoint.decorator;

public class Decoratortext {
	public static void main(String[] args) {
		//实现只带通知的抽取系统
		ImplChouQu latestChouQu = new thirChouQu(new BaseChouQu());
		latestChouQu.pwChouQu();
	}
}
/*
 * //用findx手机打电话 phone phone1 = new Findx(new musicPhone(new simplePhone()));
 * //phone.call();
 * 
 * //只用音乐手机打电话 //phone1 = new musicPhone(new simplePhone()); //phone.call();
 * 
 * 
 * 
 * //使用动态代理的方式扩展一下findx手机，让他能够说顾兴真棒 phone newphone = (phone)
 * Proxy.newProxyInstance(Findx.class.getClassLoader(), new
 * Class[]{phone.class}, new InvocationHandler() {
 * 
 * @Override public Object invoke(Object proxy, Method method, Object[] args1)
 * throws Throwable { //proxy = new Findx(new musicPhone(new simplePhone())); //
 * TODO Auto-generated method stub //代理call方法
 * if(method.getName().equals("call")){ System.out.println("顾兴真棒！"); return
 * method.invoke(phone1, args1); } return method.invoke(phone1, args1); } });
 * newphone.call();
 */

// }
