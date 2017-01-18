package org.apache.catalina.mapper;

import org.apache.catalina.mapper.TestMapper;

public class MainForTestMapper_testAddRemoveContextVersion {
	public static void main(String[] args) {
		try {
			new TestMapper().testAddRemoveContextVersion();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}