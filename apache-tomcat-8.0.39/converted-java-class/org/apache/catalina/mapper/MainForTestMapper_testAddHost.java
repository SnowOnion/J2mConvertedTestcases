package org.apache.catalina.mapper;

import org.apache.catalina.mapper.TestMapper;

public class MainForTestMapper_testAddHost {
	public static void main(String[] args) {
		try {
			new TestMapper().testAddHost();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}