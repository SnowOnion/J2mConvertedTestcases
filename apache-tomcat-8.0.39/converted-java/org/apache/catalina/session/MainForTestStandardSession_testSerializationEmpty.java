package org.apache.catalina.session;

import org.apache.catalina.session.TestStandardSession;

public class MainForTestStandardSession_testSerializationEmpty {
	public static void main(String[] args) {
		try {
			new TestStandardSession().testSerializationEmpty();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}