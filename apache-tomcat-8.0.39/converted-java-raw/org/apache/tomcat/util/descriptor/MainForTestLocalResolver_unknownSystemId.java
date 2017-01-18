package org.apache.tomcat.util.descriptor;

import org.apache.tomcat.util.descriptor.TestLocalResolver;

public class MainForTestLocalResolver_unknownSystemId {
	public static void main(String[] args) {
		try {
			new TestLocalResolver().unknownSystemId();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}