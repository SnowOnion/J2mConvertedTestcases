package org.apache.catalina.valves;

import org.apache.catalina.valves.TestRemoteIpValve;

public class MainForTestRemoteIpValve_testInvokeXforwardedProtoIsNullForIncomingHttpRequest {
    public static void main(String[] args) {
        try {
            TestRemoteIpValve objTestRemoteIpValve = new TestRemoteIpValve();
            objTestRemoteIpValve.testInvokeXforwardedProtoIsNullForIncomingHttpRequest();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
