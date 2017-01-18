package org.apache.naming.resources;

import org.apache.naming.resources.TestWarDirContext;

public class MainForTestWarDirContext_testReservedJNDIFileNamesWithCache {
	public static void main(String[] args) {
		try {
			new TestWarDirContext().testReservedJNDIFileNamesWithCache();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}