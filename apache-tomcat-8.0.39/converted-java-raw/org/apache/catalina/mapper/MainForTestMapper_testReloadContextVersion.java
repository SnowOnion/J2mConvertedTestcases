package org.apache.catalina.mapper;

import org.apache.catalina.mapper.TestMapper;

public class MainForTestMapper_testReloadContextVersion {
	public static void main(String[] args) {
		try {
			new TestMapper().testReloadContextVersion();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}