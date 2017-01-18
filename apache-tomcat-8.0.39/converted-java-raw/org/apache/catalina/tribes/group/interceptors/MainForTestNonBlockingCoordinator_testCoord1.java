package org.apache.catalina.tribes.group.interceptors;

import org.apache.catalina.tribes.group.interceptors.TestNonBlockingCoordinator;

public class MainForTestNonBlockingCoordinator_testCoord1 {
	public static void main(String[] args) {
		try {
			new TestNonBlockingCoordinator().testCoord1();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}