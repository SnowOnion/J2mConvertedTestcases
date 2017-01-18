package org.apache.catalina.realm;

import org.apache.catalina.realm.TestJNDIRealm;

public class MainForTestJNDIRealm_testAuthenticateWithUserPasswordAndCredentialHandler {
	public static void main(String[] args) {
		try {
			new TestJNDIRealm().testAuthenticateWithUserPasswordAndCredentialHandler();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}