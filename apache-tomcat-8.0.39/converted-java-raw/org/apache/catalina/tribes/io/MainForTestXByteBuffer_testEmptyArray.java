package org.apache.catalina.tribes.io;

import org.apache.catalina.tribes.io.TestXByteBuffer;

public class MainForTestXByteBuffer_testEmptyArray {
	public static void main(String[] args) {
		try {
			new TestXByteBuffer().testEmptyArray();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}