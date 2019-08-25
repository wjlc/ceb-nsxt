package io.alauda.nsxt;

import io.alauda.nsxt.controller.LocalizationController;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NsxtTests {

	@Autowired
	public LocalizationController localizationController;

	@Test
	public void contextLoads() {
		Assert.assertEquals("ok", localizationController.getIpPools());
	}

}
