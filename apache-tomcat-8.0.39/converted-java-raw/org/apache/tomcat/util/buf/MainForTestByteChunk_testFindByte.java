package org.apache.tomcat.util.buf;

import org.apache.tomcat.util.buf.TestByteChunk;

public class MainForTestByteChunk_testFindByte {
	public static void main(String[] args) {
		try {
			new TestByteChunk().testFindByte();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}