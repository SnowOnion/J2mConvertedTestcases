package org.apache.catalina.mapper;

import org.apache.catalina.mapper.TestMapperWebapps;

public class MainForTestMapperWebapps_testWelcomeFileNotStrict {
	public static void main(String[] args) {
		try {
			new TestMapperWebapps().testWelcomeFileNotStrict();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}