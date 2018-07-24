package com.revature.assignforce.testing;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class DiscoveryServiceTest {
	@Test
	public void applicationContextTest() throws Exception {
		com.revature.assignforce.DiscoveryServiceApplication.main(new String[] {});
	}
}
