package org.apache.catalina.mapper;

import org.apache.catalina.mapper.TestMapperWebapps;

public class MainForTestMapperWebapps_testContextRoot_Bug53339 {
	public static void main(String[] args) {
		try {
			new TestMapperWebapps().testContextRoot_Bug53339();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}