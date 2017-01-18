package org.apache.catalina.session;

import org.apache.catalina.session.TestStandardSession;

public class MainForTestStandardSession_serializeSkipsNonSerializableAttributes {
	public static void main(String[] args) {
		try {
			new TestStandardSession().serializeSkipsNonSerializableAttributes();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}