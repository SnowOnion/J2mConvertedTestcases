package org.apache.catalina.session;

import org.apache.catalina.session.TestStandardSession;

public class MainForTestStandardSession_testSerializationSimple02 {
	public static void main(String[] args) {
		try {
			new TestStandardSession().testSerializationSimple02();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}