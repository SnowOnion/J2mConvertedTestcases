package org.apache.tomcat.util.descriptor.web;

import org.apache.tomcat.util.descriptor.web.TestServletDef;

public class MainForTestServletDef_testSetServletNameEmptyString {
    public static void main(String[] args) {
        try {
            TestServletDef objTestServletDef = new TestServletDef();
            objTestServletDef.testSetServletNameEmptyString();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
