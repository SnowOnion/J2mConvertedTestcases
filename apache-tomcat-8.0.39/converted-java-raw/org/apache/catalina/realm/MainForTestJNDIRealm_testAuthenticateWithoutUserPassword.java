package org.apache.catalina.realm;

import org.apache.catalina.realm.TestJNDIRealm;

public class MainForTestJNDIRealm_testAuthenticateWithoutUserPassword {
	public static void main(String[] args) {
		try {
			new TestJNDIRealm().testAuthenticateWithoutUserPassword();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}