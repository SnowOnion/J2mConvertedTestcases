package org.apache.catalina.tribes.membership;

import org.apache.catalina.tribes.membership.TestMemberImplSerialization;

public class MainForTestMemberImplSerialization_testSerializationOne {
	public static void main(String[] args) {
		try {
			new TestMemberImplSerialization().testSerializationOne();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}