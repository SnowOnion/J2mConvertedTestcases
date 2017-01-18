package org.apache.catalina.realm;

import org.apache.catalina.realm.TestSecretKeyCredentialHandler;

public class MainForTestSecretKeyCredentialHandler_testGeneral {
	public static void main(String[] args) {
		try {
			new TestSecretKeyCredentialHandler().testGeneral();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}