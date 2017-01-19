package org.apache.tomcat.util.scan;

import org.apache.tomcat.util.scan.TestStandardJarScanner;

public class MainForTestStandardJarScanner_testWebappClassPath {
    public static void main(String[] args) {
        try {
            TestStandardJarScanner objTestStandardJarScanner = new TestStandardJarScanner();
            objTestStandardJarScanner.testWebappClassPath();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
