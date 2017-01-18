package org.apache.catalina.filters;

import org.apache.catalina.filters.TestRemoteIpFilter;

public class MainForTestRemoteIpFilter_testHeaderNamesCaseInsensitivity {
	public static void main(String[] args) {
		try {
			new TestRemoteIpFilter().testHeaderNamesCaseInsensitivity();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}