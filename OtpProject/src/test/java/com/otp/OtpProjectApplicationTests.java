package com.otp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.otp.entity.Email;
import com.otp.repository.MailRepo;
import com.otp.service.MailService;
import com.otp.service.MailServiceImpl;

@SpringBootTest
class OtpProjectApplicationTests {

	
	
	
	private MailServiceImpl mail;

	
	private MailRepo repo;

	@Test
	@DisplayName("Validate Email 1")
	void testCheckEmail1() {
	//fail("Not yet implemented");
	MailServiceImpl service=new MailServiceImpl();
	   boolean expected=true;
	   boolean actual=service.checkEmail("xyz@gmail.com");
	   assertEquals(expected,actual);
	}

	@Test
	@DisplayName("Validate Email 2")
	void testCheckEmail2() {
	//fail("Not yet implemented");
	MailServiceImpl service=new MailServiceImpl();
	   boolean expected=true;
	   boolean actual=service.checkEmail("xyz@gmail.");
	   assertEquals(expected,actual);
	}
	




}
