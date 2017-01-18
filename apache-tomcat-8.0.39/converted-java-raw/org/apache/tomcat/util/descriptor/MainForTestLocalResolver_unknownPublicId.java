package org.apache.tomcat.util.descriptor;

import org.apache.tomcat.util.descriptor.TestLocalResolver;

public class MainForTestLocalResolver_unknownPublicId {
	public static void main(String[] args) {
		try {
			new TestLocalResolver().unknownPublicId();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}