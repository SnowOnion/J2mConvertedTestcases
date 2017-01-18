package org.apache.catalina.connector;

import org.apache.catalina.connector.TestSendFile;

public class MainForTestSendFile_testSendFile {
	public static void main(String[] args) {
		try {
			new TestSendFile().testSendFile();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}