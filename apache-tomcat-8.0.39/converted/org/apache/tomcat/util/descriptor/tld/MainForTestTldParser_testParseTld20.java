package org.apache.tomcat.util.descriptor.tld;

import org.apache.tomcat.util.descriptor.tld.TestTldParser;

public class MainForTestTldParser_testParseTld20 {
    public static void main(String[] args) {
        try {
            TestTldParser objTestTldParser = new TestTldParser();
            objTestTldParser.init();
            objTestTldParser.testParseTld20();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
