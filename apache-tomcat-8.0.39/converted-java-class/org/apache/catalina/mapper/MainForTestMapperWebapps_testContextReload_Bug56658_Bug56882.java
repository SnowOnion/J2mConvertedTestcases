package org.apache.catalina.mapper;

import org.apache.catalina.mapper.TestMapperWebapps;

public class MainForTestMapperWebapps_testContextReload_Bug56658_Bug56882 {
	public static void main(String[] args) {
		try {
			new TestMapperWebapps().testContextReload_Bug56658_Bug56882();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}