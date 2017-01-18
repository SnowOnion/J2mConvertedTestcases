package org.apache.catalina.loader;

import org.apache.catalina.loader.TestVirtualWebappLoader;

public class MainForTestVirtualWebappLoader_testStartInternal {
	public static void main(String[] args) {
		try {
			new TestVirtualWebappLoader().testStartInternal();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}