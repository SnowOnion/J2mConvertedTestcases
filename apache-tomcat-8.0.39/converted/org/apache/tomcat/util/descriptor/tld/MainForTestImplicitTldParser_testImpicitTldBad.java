package org.apache.tomcat.util.descriptor.tld;

import org.apache.tomcat.util.descriptor.tld.TestImplicitTldParser;

public class MainForTestImplicitTldParser_testImpicitTldBad {
    public static void main(String[] args) {
        try {
            TestImplicitTldParser objTestImplicitTldParser = new TestImplicitTldParser();
            objTestImplicitTldParser.init();
            objTestImplicitTldParser.testImpicitTldBad();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
