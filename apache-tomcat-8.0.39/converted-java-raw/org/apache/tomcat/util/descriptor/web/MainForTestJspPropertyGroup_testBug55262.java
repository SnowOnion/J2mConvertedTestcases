package org.apache.tomcat.util.descriptor.web;

import org.apache.tomcat.util.descriptor.web.TestJspPropertyGroup;

public class MainForTestJspPropertyGroup_testBug55262 {
	public static void main(String[] args) {
		try {
			new TestJspPropertyGroup().testBug55262();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}