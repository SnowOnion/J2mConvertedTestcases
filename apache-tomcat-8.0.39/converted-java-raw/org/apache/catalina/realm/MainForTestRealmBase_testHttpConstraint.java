package org.apache.catalina.realm;

import org.apache.catalina.realm.TestRealmBase;

public class MainForTestRealmBase_testHttpConstraint {
	public static void main(String[] args) {
		try {
			new TestRealmBase().testHttpConstraint();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}