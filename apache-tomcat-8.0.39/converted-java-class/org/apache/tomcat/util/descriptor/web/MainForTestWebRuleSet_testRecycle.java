package org.apache.tomcat.util.descriptor.web;

import org.apache.tomcat.util.descriptor.web.TestWebRuleSet;

public class MainForTestWebRuleSet_testRecycle {
	public static void main(String[] args) {
		try {
			new TestWebRuleSet().testRecycle();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}