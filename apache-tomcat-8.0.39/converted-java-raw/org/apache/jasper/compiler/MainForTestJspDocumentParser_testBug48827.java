package org.apache.jasper.compiler;

import org.apache.jasper.compiler.TestJspDocumentParser;

public class MainForTestJspDocumentParser_testBug48827 {
	public static void main(String[] args) {
		try {
			new TestJspDocumentParser().testBug48827();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}