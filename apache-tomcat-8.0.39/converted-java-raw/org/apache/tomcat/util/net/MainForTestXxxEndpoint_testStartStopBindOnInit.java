package org.apache.tomcat.util.net;

import org.apache.tomcat.util.net.TestXxxEndpoint;

public class MainForTestXxxEndpoint_testStartStopBindOnInit {
	public static void main(String[] args) {
		try {
			new TestXxxEndpoint().testStartStopBindOnInit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}