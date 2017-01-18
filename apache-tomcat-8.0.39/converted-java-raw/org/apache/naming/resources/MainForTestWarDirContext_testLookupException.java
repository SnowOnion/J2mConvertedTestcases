package org.apache.naming.resources;

import org.apache.naming.resources.TestWarDirContext;

public class MainForTestWarDirContext_testLookupException {
	public static void main(String[] args) {
		try {
			new TestWarDirContext().testLookupException();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}