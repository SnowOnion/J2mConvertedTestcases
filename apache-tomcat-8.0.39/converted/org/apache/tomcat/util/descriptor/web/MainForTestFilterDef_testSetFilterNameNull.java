package org.apache.tomcat.util.descriptor.web;

import org.apache.tomcat.util.descriptor.web.TestFilterDef;

public class MainForTestFilterDef_testSetFilterNameNull {
    public static void main(String[] args) {
        try {
            TestFilterDef objTestFilterDef = new TestFilterDef();
            objTestFilterDef.testSetFilterNameNull();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
