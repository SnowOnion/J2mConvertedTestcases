package org.apache.tomcat.util.net;

import org.apache.tomcat.util.net.TestXxxEndpoint;

public class MainForTestXxxEndpoint_testStartStopBindOnStart {
	public static void main(String[] args) {
		try {
			new TestXxxEndpoint().testStartStopBindOnStart();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}