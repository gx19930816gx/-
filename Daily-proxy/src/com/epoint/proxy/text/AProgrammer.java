package com.epoint.proxy.text;

public class AProgrammer implements ImplProgrammer{
	//项目经理类背后有个开发负责人
	private BProgrammer B;
	
	public  AProgrammer() {
		// TODO Auto-generated constructor stub
		B=new BProgrammer();
	}
	
	@Override
	public void coding() {
		// TODO 写代码的活儿交给B
		B.coding();
	}
	
	//项目经理新增需求沟通功能 
	public void speaking(){
		System.out.println("需求沟通中....");
	}
}
