package com.riskigalang.implementjwt;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class ImplementJwtApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void waktu() {
		System.out.println("Waktu : {}"+ LocalDateTime.now());
	}

}
