package org.apache.juli;

import org.apache.juli.TestClassLoaderLogManager;

public class MainForTestClassLoaderLogManager_testBug56082 {
	public static void main(String[] args) {
		try {
			new TestClassLoaderLogManager().testBug56082();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}