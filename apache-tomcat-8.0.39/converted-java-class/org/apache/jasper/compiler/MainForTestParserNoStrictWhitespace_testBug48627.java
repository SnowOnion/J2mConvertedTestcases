package org.apache.jasper.compiler;

import org.apache.jasper.compiler.TestParserNoStrictWhitespace;

public class MainForTestParserNoStrictWhitespace_testBug48627 {
	public static void main(String[] args) {
		try {
			new TestParserNoStrictWhitespace().testBug48627();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}