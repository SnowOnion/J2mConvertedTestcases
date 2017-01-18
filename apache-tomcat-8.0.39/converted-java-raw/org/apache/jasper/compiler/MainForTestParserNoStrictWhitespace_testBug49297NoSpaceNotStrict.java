package org.apache.jasper.compiler;

import org.apache.jasper.compiler.TestParserNoStrictWhitespace;

public class MainForTestParserNoStrictWhitespace_testBug49297NoSpaceNotStrict {
	public static void main(String[] args) {
		try {
			new TestParserNoStrictWhitespace().testBug49297NoSpaceNotStrict();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}