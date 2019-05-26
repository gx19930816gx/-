package com.epoint.decorator;
/**
 * 最简单的电话，基础功能
 * @author GX
 *
 */
public class simplePhone implements phone {

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("电话接通");
	}

	@Override
	public void sendmsg() {
		// TODO Auto-generated method stub
		
	}

}
