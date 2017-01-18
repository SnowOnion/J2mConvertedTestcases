package org.apache.catalina.session;

import org.apache.catalina.session.Threading;

public class MainForThreading_testFileInputStream {
	public static void main(String[] args) {
		try {
			new Threading().testFileInputStream();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}