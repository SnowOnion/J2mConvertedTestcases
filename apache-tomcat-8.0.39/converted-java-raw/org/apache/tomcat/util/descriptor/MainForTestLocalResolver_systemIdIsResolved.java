package org.apache.tomcat.util.descriptor;

import org.apache.tomcat.util.descriptor.TestLocalResolver;

public class MainForTestLocalResolver_systemIdIsResolved {
	public static void main(String[] args) {
		try {
			new TestLocalResolver().systemIdIsResolved();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}