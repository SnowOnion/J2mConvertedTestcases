package org.apache.tomcat.util.descriptor.web;

import org.apache.tomcat.util.descriptor.web.TestWebXmlOrdering;

public class MainForTestWebXmlOrdering_testOrderWebFragmentsAbsolute {
    public static void main(String[] args) {
        try {
            TestWebXmlOrdering objTestWebXmlOrdering = new TestWebXmlOrdering();
            objTestWebXmlOrdering.setUp();
            objTestWebXmlOrdering.testOrderWebFragmentsAbsolute();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
