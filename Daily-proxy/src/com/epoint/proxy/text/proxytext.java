package com.epoint.proxy.text;

import java.lang.reflect.Proxy;

public class proxytext {
	public static void main(String[] args) {
		// ���弸��������Աa,b,c�����͵��������һ������
		ImplProgrammer a = new BProgrammer();//ҵ�񿪷�
		ImplProgrammer b = new BProgrammer();//���꿪��
		ImplProgrammer c = new BProgrammer();//���߿���
		requestType Type=requestType.ҵ������;
		// ��̬�����һ��AProgrammer�࣬��ǿBProgrammer����
		ImplProgrammer Aprogrammer = (ImplProgrammer) Proxy.newProxyInstance(BProgrammer.class.getClassLoader(),
				BProgrammer.class.getInterfaces(), (proxy, method, args1) -> {
					//�ȹ�ͨһ������  
					System.out.println("��ͨһ������");
					switch(Type){
						case ҵ������:
							System.out.println("ҵ�񿪷�ʵ��");
							return method.invoke(a, args1);
						case ��������:
							System.out.println("���꿪��ʵ��");
							return method.invoke(b, args1);
						case ��������:
							System.out.println("���߿���ʵ��");
							return method.invoke(c, args1);
					default:
						return null;
					}
				});
		Aprogrammer.coding();
	}
	public enum requestType{
		ҵ������,��������,��������;
	}
}
