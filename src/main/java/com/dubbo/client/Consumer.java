package com.dubbo.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dubbo.server.HelloService;

public class Consumer {
	   public static void main(String[] args) throws Exception {
	        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"classpath:/spring/consumer.xml"});
	        context.start();
	 
	        HelloService demoService = (HelloService)context.getBean("demoService"); // 获取远程服务代理
	        String hello = demoService.sayHello("world"); // 执行远程方法
	 
	        System.out.println( hello ); // 显示调用结果
	    }
}
