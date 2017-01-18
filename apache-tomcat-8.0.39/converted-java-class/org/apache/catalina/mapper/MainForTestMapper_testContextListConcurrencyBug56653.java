package org.apache.catalina.mapper;

import org.apache.catalina.mapper.TestMapper;

public class MainForTestMapper_testContextListConcurrencyBug56653 {
	public static void main(String[] args) {
		try {
			new TestMapper().testContextListConcurrencyBug56653();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}