package org.apache.jasper.compiler;

import org.apache.jasper.compiler.TestParser;

public class MainForTestParser_testBug52335 {
	public static void main(String[] args) {
		try {
			new TestParser().testBug52335();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}