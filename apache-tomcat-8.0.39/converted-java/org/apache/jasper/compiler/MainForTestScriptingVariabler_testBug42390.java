package org.apache.jasper.compiler;

import org.apache.jasper.compiler.TestScriptingVariabler;

public class MainForTestScriptingVariabler_testBug42390 {
	public static void main(String[] args) {
		try {
			new TestScriptingVariabler().testBug42390();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}