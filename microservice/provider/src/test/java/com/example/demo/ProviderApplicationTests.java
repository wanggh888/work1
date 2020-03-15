package com.example.demo;

import com.example.ProviderApplication;
import com.example.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes={ProviderApplication.class})
class ProviderApplicationTests {
	@Autowired
private UserServiceImpl impl;
	@Test
	void testSaveUser() {
		impl.addUser();

	}

}
