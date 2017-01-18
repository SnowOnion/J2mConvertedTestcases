package org.apache.jasper.compiler;

import org.apache.jasper.compiler.TestJspDocumentParser;

public class MainForTestJspDocumentParser_testBug54801 {
	public static void main(String[] args) {
		try {
			new TestJspDocumentParser().testBug54801();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}