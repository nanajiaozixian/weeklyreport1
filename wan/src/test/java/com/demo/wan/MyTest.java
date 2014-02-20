package com.demo.wan;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.demo.wan.service.TestService;

@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "/spring/view.xml")
public class MyTest {

	@Autowired 
	private TestService testService;
	
	@Test
	public void test01(){
		System.out.println("||"+testService.gameCount());
        System.out.println("||||");
	}
}
