package org.apache.juli;

import org.apache.juli.TestClassLoaderLogManager;

public class MainForTestClassLoaderLogManager_testReplace {
	public static void main(String[] args) {
		try {
			new TestClassLoaderLogManager().testReplace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}