package org.apache.jasper.compiler;

import org.apache.jasper.compiler.TestJspDocumentParser;

public class MainForTestJspDocumentParser_testBug47977 {
	public static void main(String[] args) {
		try {
			new TestJspDocumentParser().testBug47977();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}