package com.cj.myapp;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JDBCConn {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void testConnection() {
		try {
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "1234");
			logger.info("����Ŭ ���� ����");
		} catch (Exception e) {
			e.printStackTrace();
		}
		//fail("Not yet implemented");
	}

}