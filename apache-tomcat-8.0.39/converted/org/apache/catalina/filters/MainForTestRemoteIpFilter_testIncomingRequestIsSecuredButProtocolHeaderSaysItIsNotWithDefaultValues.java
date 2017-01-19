package org.apache.catalina.filters;

import org.apache.catalina.filters.TestRemoteIpFilter;

public class MainForTestRemoteIpFilter_testIncomingRequestIsSecuredButProtocolHeaderSaysItIsNotWithDefaultValues {
    public static void main(String[] args) {
        try {
            TestRemoteIpFilter.setUpPerTestClass();
            TestRemoteIpFilter objTestRemoteIpFilter = new TestRemoteIpFilter();
            objTestRemoteIpFilter.setUp();
            objTestRemoteIpFilter.testIncomingRequestIsSecuredButProtocolHeaderSaysItIsNotWithDefaultValues();
            objTestRemoteIpFilter.tearDown();
            TestRemoteIpFilter.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
