package org.apache.tomcat.util.descriptor.tld;

import org.apache.tomcat.util.descriptor.tld.TestImplicitTldParser;

public class MainForTestImplicitTldParser_testImpicitTldBad {
	public static void main(String[] args) {
		try {
			new TestImplicitTldParser().testImpicitTldBad();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}