package org.apache.catalina.mapper;

import org.apache.catalina.mapper.TestMapper;

public class MainForTestMapper_testRemoveHost {
	public static void main(String[] args) {
		try {
			new TestMapper().testRemoveHost();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}