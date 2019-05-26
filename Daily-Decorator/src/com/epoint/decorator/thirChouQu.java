package com.epoint.decorator;

public class thirChouQu extends decoratorChouQu{
	
	public thirChouQu(ImplChouQu chouqu) {
		super(chouqu);
		// TODO Auto-generated constructor stub
	}
	public void tongZhiPW(){
		System.out.println("Í¨ÖªÆÀÎ¯....");
	}
	@Override
	public void pwChouQu(){
		super.pwChouQu();
		tongZhiPW();
	}
}
