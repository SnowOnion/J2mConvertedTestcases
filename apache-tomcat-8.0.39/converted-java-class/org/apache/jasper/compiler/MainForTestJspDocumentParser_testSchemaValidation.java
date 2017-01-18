package org.apache.jasper.compiler;

import org.apache.jasper.compiler.TestJspDocumentParser;

public class MainForTestJspDocumentParser_testSchemaValidation {
	public static void main(String[] args) {
		try {
			new TestJspDocumentParser().testSchemaValidation();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}