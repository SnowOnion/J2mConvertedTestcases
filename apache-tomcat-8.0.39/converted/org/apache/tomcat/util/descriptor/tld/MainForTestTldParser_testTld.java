package org.apache.tomcat.util.descriptor.tld;

import org.apache.tomcat.util.descriptor.tld.TestTldParser;

public class MainForTestTldParser_testTld {
    public static void main(String[] args) {
        try {
            TestTldParser objTestTldParser = new TestTldParser();
            objTestTldParser.init();
            objTestTldParser.testTld();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
