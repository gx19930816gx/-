package com.epoint.decorator;

public class secChouQu extends decoratorChouQu {
	
	public secChouQu(ImplChouQu chouqu) {
		super(chouqu);
		// TODO Auto-generated constructor stub
	}
	public void neiDingPW(){
		System.out.println("�ڶ���ί�ˣ��ٺٺ�");
	}
	@Override
	public void pwChouQu(){
		neiDingPW();
		super.pwChouQu();
	}
}
