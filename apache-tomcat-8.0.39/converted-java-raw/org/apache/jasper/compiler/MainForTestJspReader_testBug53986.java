package org.apache.jasper.compiler;

import org.apache.jasper.compiler.TestJspReader;

public class MainForTestJspReader_testBug53986 {
	public static void main(String[] args) {
		try {
			new TestJspReader().testBug53986();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}