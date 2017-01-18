package org.apache.catalina.core;

import org.apache.catalina.core.TestDefaultInstanceManager;

public class MainForTestDefaultInstanceManager_testClassUnloading {
	public static void main(String[] args) {
		try {
			new TestDefaultInstanceManager().testClassUnloading();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}