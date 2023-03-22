package com.yedam.app.spring;

import org.springframework.stereotype.Component;

@Component("tv")  //applicationContext.xml에 등록대신 선언으로 사용가능해짐
public class SamsungTV implements TV {

	

	@Override
	public void on() {
		System.out.println("스프링 방식으로 SamsungTV 켬");

	}

}
