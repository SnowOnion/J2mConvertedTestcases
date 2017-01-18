package org.apache.catalina.tribes.membership;

import org.apache.catalina.tribes.membership.TestMemberImplSerialization;

public class MainForTestMemberImplSerialization_testUdpPort {
	public static void main(String[] args) {
		try {
			new TestMemberImplSerialization().testUdpPort();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}