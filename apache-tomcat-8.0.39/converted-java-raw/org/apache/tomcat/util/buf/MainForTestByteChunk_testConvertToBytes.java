package org.apache.tomcat.util.buf;

import org.apache.tomcat.util.buf.TestByteChunk;

public class MainForTestByteChunk_testConvertToBytes {
	public static void main(String[] args) {
		try {
			new TestByteChunk().testConvertToBytes();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}