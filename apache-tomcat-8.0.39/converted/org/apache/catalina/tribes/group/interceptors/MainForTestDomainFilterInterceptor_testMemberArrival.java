package org.apache.catalina.tribes.group.interceptors;

import org.apache.catalina.tribes.group.interceptors.TestDomainFilterInterceptor;

public class MainForTestDomainFilterInterceptor_testMemberArrival {
    public static void main(String[] args) {
        try {
            TestDomainFilterInterceptor objTestDomainFilterInterceptor = new TestDomainFilterInterceptor();
            objTestDomainFilterInterceptor.setUp();
            objTestDomainFilterInterceptor.testMemberArrival();
            objTestDomainFilterInterceptor.tearDown();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
