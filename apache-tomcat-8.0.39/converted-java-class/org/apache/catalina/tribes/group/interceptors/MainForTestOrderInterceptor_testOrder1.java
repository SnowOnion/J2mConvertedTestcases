package org.apache.catalina.tribes.group.interceptors;

import org.apache.catalina.tribes.group.interceptors.TestOrderInterceptor;

public class MainForTestOrderInterceptor_testOrder1 {
	public static void main(String[] args) {
		try {
			new TestOrderInterceptor().testOrder1();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}