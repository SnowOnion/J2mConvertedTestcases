package org.apache.tomcat.util.descriptor;

import org.apache.tomcat.util.descriptor.TestLocalResolver;

public class MainForTestLocalResolver_absoluteSystemIdOverridesBaseURI {
	public static void main(String[] args) {
		try {
			new TestLocalResolver().absoluteSystemIdOverridesBaseURI();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}