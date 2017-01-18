package org.apache.catalina.ha.context;

import org.apache.catalina.ha.context.TestReplicatedContext;

public class MainForTestReplicatedContext_testBug57425 {
	public static void main(String[] args) {
		try {
			new TestReplicatedContext().testBug57425();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}