package org.apache.tomcat.util.descriptor;

import org.apache.tomcat.util.descriptor.TestLocalResolver;

public class MainForTestLocalResolver_unknownRelativeSystemId {
	public static void main(String[] args) {
		try {
			new TestLocalResolver().unknownRelativeSystemId();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}