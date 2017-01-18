package org.apache.jasper;

import org.apache.jasper.TestJspCompilationContext;

public class MainForTestJspCompilationContext_testTagFileInJar {
	public static void main(String[] args) {
		try {
			new TestJspCompilationContext().testTagFileInJar();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}