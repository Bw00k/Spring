package com.yedam.app.spring;

import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		GenericApplicationContext ctx  //classpath:applicationContext.xml 을 ctx에 담음
			= new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
			TV tv = (TV) ctx.getBean("tv"); //ctx에 담겨있는 Bean을 불러옴
			tv.on();
	}
}
