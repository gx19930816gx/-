package com.epoint.proxy.text;

import java.lang.reflect.Proxy;

public class proxytext {
	public static void main(String[] args) {
		// 定义几个开发人员a,b,c，这边偷懒，就用一个类了
		ImplProgrammer a = new BProgrammer();//业务开发
		ImplProgrammer b = new BProgrammer();//评标开发
		ImplProgrammer c = new BProgrammer();//工具开发
		requestType Type=requestType.业务需求;
		// 动态代理出一个AProgrammer类，增强BProgrammer功能
		ImplProgrammer Aprogrammer = (ImplProgrammer) Proxy.newProxyInstance(BProgrammer.class.getClassLoader(),
				BProgrammer.class.getInterfaces(), (proxy, method, args1) -> {
					//先沟通一下需求  
					System.out.println("沟通一下需求");
					switch(Type){
						case 业务需求:
							System.out.println("业务开发实现");
							return method.invoke(a, args1);
						case 评标需求:
							System.out.println("评标开发实现");
							return method.invoke(b, args1);
						case 工具需求:
							System.out.println("工具开发实现");
							return method.invoke(c, args1);
					default:
						return null;
					}
				});
		Aprogrammer.coding();
	}
	public enum requestType{
		业务需求,评标需求,工具需求;
	}
}
