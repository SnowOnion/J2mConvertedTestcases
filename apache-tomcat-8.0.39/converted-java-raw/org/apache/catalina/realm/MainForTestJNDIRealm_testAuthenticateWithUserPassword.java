package org.apache.catalina.realm;

import org.apache.catalina.realm.TestJNDIRealm;

public class MainForTestJNDIRealm_testAuthenticateWithUserPassword {
	public static void main(String[] args) {
		try {
			new TestJNDIRealm().testAuthenticateWithUserPassword();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}