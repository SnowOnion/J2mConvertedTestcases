package org.apache.tomcat.util.descriptor.web;

import org.apache.tomcat.util.descriptor.web.TestWebRuleSet;

public class MainForTestWebRuleSet_testSingleNameInWebFragmentXml {
	public static void main(String[] args) {
		try {
			new TestWebRuleSet().testSingleNameInWebFragmentXml();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}