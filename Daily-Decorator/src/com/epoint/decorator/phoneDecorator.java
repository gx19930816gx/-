package com.epoint.decorator;

public class phoneDecorator implements phone{
	
	private phone phone;
	public phoneDecorator(phone phone){
		this.phone = phone;
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		phone.call();
	}

	@Override
	public void sendmsg() {
		// TODO Auto-generated method stub
		phone.sendmsg();
	}

}
