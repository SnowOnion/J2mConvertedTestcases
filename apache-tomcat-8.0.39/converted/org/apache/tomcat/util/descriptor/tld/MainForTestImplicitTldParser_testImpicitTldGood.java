package org.apache.tomcat.util.descriptor.tld;

import org.apache.tomcat.util.descriptor.tld.TestImplicitTldParser;

public class MainForTestImplicitTldParser_testImpicitTldGood {
    public static void main(String[] args) {
        try {
            TestImplicitTldParser objTestImplicitTldParser = new TestImplicitTldParser();
            objTestImplicitTldParser.init();
            objTestImplicitTldParser.testImpicitTldGood();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
