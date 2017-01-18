package org.apache.tomcat.util.http.parser;

import org.apache.tomcat.util.http.parser.TestAcceptLanguage;

public class MainForTestAcceptLanguage_bug56848 {
	public static void main(String[] args) {
		try {
			new TestAcceptLanguage().bug56848();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}