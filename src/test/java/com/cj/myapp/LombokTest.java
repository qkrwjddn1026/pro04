package com.cj.myapp;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cj.dto.SampleDTO;

public class LombokTest {
	private static final Logger Logger = LoggerFactory.getLogger(LombokTest.class);

	@Test
	public void test() {
		SampleDTO dto = new SampleDTO();
		dto.setName("¹ÚÁ¤¿ì");
		dto.setAge(24);
		dto.setIq(89.2);
		
		Logger.info(dto.toString());
	}

}
