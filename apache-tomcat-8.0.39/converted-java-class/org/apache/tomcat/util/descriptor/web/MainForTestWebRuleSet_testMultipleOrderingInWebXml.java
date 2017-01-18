package org.apache.tomcat.util.descriptor.web;

import org.apache.tomcat.util.descriptor.web.TestWebRuleSet;

public class MainForTestWebRuleSet_testMultipleOrderingInWebXml {
	public static void main(String[] args) {
		try {
			new TestWebRuleSet().testMultipleOrderingInWebXml();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}