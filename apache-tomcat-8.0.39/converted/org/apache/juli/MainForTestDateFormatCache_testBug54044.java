package org.apache.juli;

import org.apache.juli.TestDateFormatCache;

public class MainForTestDateFormatCache_testBug54044 {
    public static void main(String[] args) {
        try {
            TestDateFormatCache objTestDateFormatCache = new TestDateFormatCache();
            objTestDateFormatCache.testBug54044();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
