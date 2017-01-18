package org.apache.tomcat.util.descriptor;

import org.apache.tomcat.util.descriptor.TestLocalResolver;

public class MainForTestLocalResolver_relativeSystemIdIsResolvedAgainstBaseURI {
	public static void main(String[] args) {
		try {
			new TestLocalResolver().relativeSystemIdIsResolvedAgainstBaseURI();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}