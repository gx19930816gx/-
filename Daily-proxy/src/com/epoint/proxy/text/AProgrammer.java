package com.epoint.proxy.text;

public class AProgrammer implements ImplProgrammer{
	//��Ŀ�����౳���и�����������
	private BProgrammer B;
	
	public  AProgrammer() {
		// TODO Auto-generated constructor stub
		B=new BProgrammer();
	}
	
	@Override
	public void coding() {
		// TODO д����Ļ������B
		B.coding();
	}
	
	//��Ŀ������������ͨ���� 
	public void speaking(){
		System.out.println("����ͨ��....");
	}
}
