package org.apache.tomcat.util.descriptor.web;

import org.apache.tomcat.util.descriptor.web.TestWebXmlOrdering;

public class MainForTestWebXmlOrdering_testWebFragmentsAbsoluteWrongFragmentName {
    public static void main(String[] args) {
        try {
            TestWebXmlOrdering objTestWebXmlOrdering = new TestWebXmlOrdering();
            objTestWebXmlOrdering.setUp();
            objTestWebXmlOrdering.testWebFragmentsAbsoluteWrongFragmentName();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
