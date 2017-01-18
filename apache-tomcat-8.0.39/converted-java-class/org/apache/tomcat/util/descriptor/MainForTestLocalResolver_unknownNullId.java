package org.apache.tomcat.util.descriptor;

import org.apache.tomcat.util.descriptor.TestLocalResolver;

public class MainForTestLocalResolver_unknownNullId {
	public static void main(String[] args) {
		try {
			new TestLocalResolver().unknownNullId();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}