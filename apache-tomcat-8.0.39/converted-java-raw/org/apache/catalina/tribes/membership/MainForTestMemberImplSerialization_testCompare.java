package org.apache.catalina.tribes.membership;

import org.apache.catalina.tribes.membership.TestMemberImplSerialization;

public class MainForTestMemberImplSerialization_testCompare {
	public static void main(String[] args) {
		try {
			new TestMemberImplSerialization().testCompare();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}