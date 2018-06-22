package com.spring.rest.SpringRestLearning;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.spring.rest.SpringRestLearning.controller.HelloController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringRestLearningApplicationTests {

	@Autowired
	private HelloController helloController;

	@Test
	public void contextLoads() {
		Assert.assertNotNull(helloController);
	}

}
