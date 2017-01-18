package org.apache.jasper.compiler;

import org.apache.jasper.compiler.TestParser;

public class MainForTestParser_testBug49297Tag {
	public static void main(String[] args) {
		try {
			new TestParser().testBug49297Tag();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}