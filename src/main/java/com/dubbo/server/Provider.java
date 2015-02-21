package com.dubbo.server;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Provider {

	public static void main(String ...s) throws IOException{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"classpath:spring/provider.xml"});
        context.start();
        System.in.read();
	}
}
