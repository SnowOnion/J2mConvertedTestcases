package org.apache.jasper.compiler;

import org.apache.jasper.compiler.TestTagPluginManager;

public class MainForTestTagPluginManager_testBug54240 {
	public static void main(String[] args) {
		try {
			new TestTagPluginManager().testBug54240();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}