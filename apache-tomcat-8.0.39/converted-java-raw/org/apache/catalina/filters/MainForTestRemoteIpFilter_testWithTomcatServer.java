package org.apache.catalina.filters;

import org.apache.catalina.filters.TestRemoteIpFilter;

public class MainForTestRemoteIpFilter_testWithTomcatServer {
	public static void main(String[] args) {
		try {
			new TestRemoteIpFilter().testWithTomcatServer();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}