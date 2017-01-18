package org.apache.catalina.tribes.group.interceptors;

import org.apache.catalina.tribes.group.interceptors.TestDomainFilterInterceptor;

public class MainForTestDomainFilterInterceptor_testMemberArrival {
	public static void main(String[] args) {
		try {
			new TestDomainFilterInterceptor().testMemberArrival();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}