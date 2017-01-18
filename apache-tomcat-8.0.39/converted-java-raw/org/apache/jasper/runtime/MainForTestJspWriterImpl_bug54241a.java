package org.apache.jasper.runtime;

import org.apache.jasper.runtime.TestJspWriterImpl;

public class MainForTestJspWriterImpl_bug54241a {
	public static void main(String[] args) {
		try {
			new TestJspWriterImpl().bug54241a();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}