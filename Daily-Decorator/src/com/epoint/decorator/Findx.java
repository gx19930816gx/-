package com.epoint.decorator;

public class Findx extends phoneDecorator{

	private String createname;
	public Findx(com.epoint.decorator.phone phone) {
		super(phone);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void call(){
		super.call();
		System.out.println("»¬¸ÇÉãÏñÍ·¹éÎ»£¡");
	}

	public String getCreatename() {
		return createname;
	}

	public void setCreatename(String createname) {
		this.createname = createname;
	}

}
