package com.epoint.decorator;

public class Decoratortext {
	public static void main(String[] args) {
		//ʵ��ֻ��֪ͨ�ĳ�ȡϵͳ
		ImplChouQu latestChouQu = new thirChouQu(new BaseChouQu());
		latestChouQu.pwChouQu();
	}
}
/*
 * //��findx�ֻ���绰 phone phone1 = new Findx(new musicPhone(new simplePhone()));
 * //phone.call();
 * 
 * //ֻ�������ֻ���绰 //phone1 = new musicPhone(new simplePhone()); //phone.call();
 * 
 * 
 * 
 * //ʹ�ö�̬����ķ�ʽ��չһ��findx�ֻ��������ܹ�˵������� phone newphone = (phone)
 * Proxy.newProxyInstance(Findx.class.getClassLoader(), new
 * Class[]{phone.class}, new InvocationHandler() {
 * 
 * @Override public Object invoke(Object proxy, Method method, Object[] args1)
 * throws Throwable { //proxy = new Findx(new musicPhone(new simplePhone())); //
 * TODO Auto-generated method stub //����call����
 * if(method.getName().equals("call")){ System.out.println("���������"); return
 * method.invoke(phone1, args1); } return method.invoke(phone1, args1); } });
 * newphone.call();
 */

// }
