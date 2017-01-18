package org.apache.catalina.mapper;

import org.apache.catalina.mapper.TestMapperPerformance;

public class MainForTestMapperPerformance_testPerformance {
	public static void main(String[] args) {
		try {
			new TestMapperPerformance().testPerformance();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}