package com.epoint.decorator;

public class secChouQu extends decoratorChouQu {
	
	public secChouQu(ImplChouQu chouqu) {
		super(chouqu);
		// TODO Auto-generated constructor stub
	}
	public void neiDingPW(){
		System.out.println("内定评委了，嘿嘿嘿");
	}
	@Override
	public void pwChouQu(){
		neiDingPW();
		super.pwChouQu();
	}
}
