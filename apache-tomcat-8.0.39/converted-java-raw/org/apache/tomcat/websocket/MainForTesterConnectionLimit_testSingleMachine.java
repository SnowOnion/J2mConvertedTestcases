package org.apache.tomcat.websocket;

import org.apache.tomcat.websocket.TesterConnectionLimit;

public class MainForTesterConnectionLimit_testSingleMachine {
	public static void main(String[] args) {
		try {
			new TesterConnectionLimit().testSingleMachine();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}