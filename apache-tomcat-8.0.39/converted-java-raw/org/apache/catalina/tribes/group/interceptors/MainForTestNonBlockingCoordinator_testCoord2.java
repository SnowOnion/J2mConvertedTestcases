package org.apache.catalina.tribes.group.interceptors;

import org.apache.catalina.tribes.group.interceptors.TestNonBlockingCoordinator;

public class MainForTestNonBlockingCoordinator_testCoord2 {
	public static void main(String[] args) {
		try {
			new TestNonBlockingCoordinator().testCoord2();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}