package org.bos.Achaoub;

import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.user;

import java.util.ArrayList;

import org.bos.Achaoub.entities.UserEntity;
import org.bos.Achaoub.services.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BasmaOnlineStoreApplicationTests {

	@Autowired
	private UserService userService;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	void listUsers() {
		
		ArrayList<UserEntity> list = userService.listUsers();
		
		for(UserEntity user : list) {
			System.out.println(user);
		}
	}

}
