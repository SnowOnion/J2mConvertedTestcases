package org.apache.catalina.realm;

import org.apache.catalina.realm.TestRealmBase;

public class MainForTestRealmBase_testDigestSSHAPrefix {
	public static void main(String[] args) {
		try {
			new TestRealmBase().testDigestSSHAPrefix();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}