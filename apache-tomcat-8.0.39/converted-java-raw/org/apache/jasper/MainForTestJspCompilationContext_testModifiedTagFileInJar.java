package org.apache.jasper;

import org.apache.jasper.TestJspCompilationContext;

public class MainForTestJspCompilationContext_testModifiedTagFileInJar {
	public static void main(String[] args) {
		try {
			new TestJspCompilationContext().testModifiedTagFileInJar();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}