package org.apache.catalina.util;

import org.apache.catalina.util.TestServerInfo;

public class MainForTestServerInfo_testServerInfo {
	public static void main(String[] args) {
		try {
			new TestServerInfo().testServerInfo();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}