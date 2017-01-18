package org.apache.catalina.realm;

import org.apache.catalina.realm.TestGenericPrincipal;

public class MainForTestGenericPrincipal_testSerialize01 {
	public static void main(String[] args) {
		try {
			new TestGenericPrincipal().testSerialize01();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}