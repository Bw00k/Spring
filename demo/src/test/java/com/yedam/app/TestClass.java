package com.yedam.app;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yedam.app.junit.Restaurant;


@RunWith(SpringJUnit4ClassRunner.class) //그래서 이거 적어주는거임 Junit 이 컨테이너를 생성 못해줘서 그럼
@ContextConfiguration(locations="classpath:applicationContext.xml") //여기서 이거 안먹음 
public class TestClass {
	
	
	//@Autowired
	//ApplicationContext ctx;
	
	@Autowired
	Restaurant res;
	
	@Test
	public void beanTest() {
		//Restaurant res = ctx.getBean(Restaurant.class); //class에 대한 정보를 넘겨줌
		assertNotNull(res);         //이름이 없는  녀석들에 대해서 들고올땐 getBean을 통해
	}
	
}
