package org.apache.jasper.compiler;

import org.apache.jasper.compiler.TestScriptingVariabler;

public class MainForTestScriptingVariabler_testBug48616 {
	public static void main(String[] args) {
		try {
			new TestScriptingVariabler().testBug48616();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}