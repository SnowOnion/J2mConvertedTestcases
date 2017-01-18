package org.apache.naming.resources;

import org.apache.naming.resources.TestWarDirContext;

public class MainForTestWarDirContext_testReservedJNDIFileNamesNoCache {
	public static void main(String[] args) {
		try {
			new TestWarDirContext().testReservedJNDIFileNamesNoCache();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}