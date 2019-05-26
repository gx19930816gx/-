package com.epoint.decorator;

public abstract class decoratorChouQu implements ImplChouQu{

	private ImplChouQu chouqu;
	public  decoratorChouQu(ImplChouQu chouqu) {
		// TODO Auto-generated constructor stub
		this.chouqu=chouqu;
	}
	@Override
	public void pwChouQu() {
		// TODO Auto-generated method stub
		chouqu.pwChouQu();
	}
}
