package org.apache.tomcat.util.descriptor;

import org.apache.tomcat.util.descriptor.TestLocalResolver;

public class MainForTestLocalResolver_systemIdIsIgnoredWhenPublicIdIsResolved {
	public static void main(String[] args) {
		try {
			new TestLocalResolver().systemIdIsIgnoredWhenPublicIdIsResolved();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}