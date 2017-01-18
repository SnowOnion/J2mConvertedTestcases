package org.apache.catalina.realm;

import org.apache.catalina.realm.TestMessageDigestCredentialHandler;

public class MainForTestMessageDigestCredentialHandler_testGeneral {
	public static void main(String[] args) {
		try {
			new TestMessageDigestCredentialHandler().testGeneral();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}