package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientApp {

	public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
		Object ob=ctx.getBean("demo");
		Test t=(Test)ob;
		System.out.println("\n\n\t\tObject is: "+t);
		Object obj=ctx.getBean("c");
		System.out.println("\n"+ob);
		
		System.out.println("\n\n\t\tPROGRAM BY PRATIK DIMBLE (04:00pm BATCH)");
	}
}
