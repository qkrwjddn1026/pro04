package com.cj.myapp;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cj.dto.MemberDTO;

public class DTOTest {
	private static final Logger Logger = LoggerFactory.getLogger(DTOTest.class);
	@Test
	public void test() {
		MemberDTO dto = new MemberDTO();
		dto.setId("pjw");
		dto.setPw("1234");
		dto.setName("박정우");
		dto.setTel("01012341234");
		dto.setPt(0);
		dto.setAddr1("경기도");
		dto.setRegdate("2022-12-12");
		
		Logger.info(dto.toString());
	}

}
