package org.apache.catalina.mapper;

import org.apache.catalina.mapper.TestMapperListener;

public class MainForTestMapperListener_testTomcatRestartListenerCount_Bug56717 {
	public static void main(String[] args) {
		try {
			new TestMapperListener().testTomcatRestartListenerCount_Bug56717();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}