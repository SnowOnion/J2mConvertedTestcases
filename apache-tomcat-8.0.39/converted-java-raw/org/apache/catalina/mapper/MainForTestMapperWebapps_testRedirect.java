package org.apache.catalina.mapper;

import org.apache.catalina.mapper.TestMapperWebapps;

public class MainForTestMapperWebapps_testRedirect {
	public static void main(String[] args) {
		try {
			new TestMapperWebapps().testRedirect();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}