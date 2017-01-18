package org.apache.catalina.mapper;

import org.apache.catalina.mapper.TestMapperWebapps;

public class MainForTestMapperWebapps_testWelcomeFileStrict {
	public static void main(String[] args) {
		try {
			new TestMapperWebapps().testWelcomeFileStrict();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}