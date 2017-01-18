package org.apache.jasper.compiler;

import org.apache.jasper.compiler.TestParserNoStrictWhitespace;

public class MainForTestParserNoStrictWhitespace_testBug49297DuplicateAttr {
	public static void main(String[] args) {
		try {
			new TestParserNoStrictWhitespace().testBug49297DuplicateAttr();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}