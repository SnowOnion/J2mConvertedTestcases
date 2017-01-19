package org.apache.tomcat.util.descriptor.web;

import org.apache.tomcat.util.descriptor.web.TestWebRuleSet;

public class MainForTestWebRuleSet_testSingleOrderingInWebXml {
    public static void main(String[] args) {
        try {
            TestWebRuleSet objTestWebRuleSet = new TestWebRuleSet();
            objTestWebRuleSet.testSingleOrderingInWebXml();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
