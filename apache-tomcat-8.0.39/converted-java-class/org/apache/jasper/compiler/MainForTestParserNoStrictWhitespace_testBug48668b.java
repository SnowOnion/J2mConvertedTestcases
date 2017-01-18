package org.apache.jasper.compiler;

import org.apache.jasper.compiler.TestParserNoStrictWhitespace;

public class MainForTestParserNoStrictWhitespace_testBug48668b {
	public static void main(String[] args) {
		try {
			new TestParserNoStrictWhitespace().testBug48668b();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}