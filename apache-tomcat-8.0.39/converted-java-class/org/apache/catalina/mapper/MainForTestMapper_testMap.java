package org.apache.catalina.mapper;

import org.apache.catalina.mapper.TestMapper;

public class MainForTestMapper_testMap {
	public static void main(String[] args) {
		try {
			new TestMapper().testMap();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}