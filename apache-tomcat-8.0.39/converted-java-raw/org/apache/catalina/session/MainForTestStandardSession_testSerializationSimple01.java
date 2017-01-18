package org.apache.catalina.session;

import org.apache.catalina.session.TestStandardSession;

public class MainForTestStandardSession_testSerializationSimple01 {
	public static void main(String[] args) {
		try {
			new TestStandardSession().testSerializationSimple01();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}