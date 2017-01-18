package org.apache.catalina.session;

import org.apache.catalina.session.TestPersistentManager;

public class MainForTestPersistentManager_testMinIdleSwap {
	public static void main(String[] args) {
		try {
			new TestPersistentManager().testMinIdleSwap();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}