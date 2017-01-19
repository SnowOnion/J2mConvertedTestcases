package org.apache.tomcat.util.descriptor.web;

import org.apache.tomcat.util.descriptor.web.TestSecurityConstraint;

public class MainForTestSecurityConstraint_testCreateConstraints {
    public static void main(String[] args) {
        try {
            TestSecurityConstraint objTestSecurityConstraint = new TestSecurityConstraint();
            objTestSecurityConstraint.testCreateConstraints();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
