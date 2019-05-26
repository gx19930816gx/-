package com.epoint.decorator;

public class musicPhone extends phoneDecorator {

	public musicPhone(phone phone)  {
		super(phone);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void call(){
		System.out.println("¿¥∂Œ≤ ¡Â");
		super.call();
	}

}
