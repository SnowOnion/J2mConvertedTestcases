package org.apache.tomcat.util.descriptor;

import org.apache.tomcat.util.descriptor.TestLocalResolver;

public class MainForTestLocalResolver_publicIdIsResolved {
	public static void main(String[] args) {
		try {
			new TestLocalResolver().publicIdIsResolved();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}