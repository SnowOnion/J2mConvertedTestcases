package org.apache.tomcat.util.descriptor.tld;

import org.apache.tomcat.util.descriptor.tld.TestImplicitTldParser;

public class MainForTestImplicitTldParser_testImpicitTldGood {
	public static void main(String[] args) {
		try {
			new TestImplicitTldParser().testImpicitTldGood();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}