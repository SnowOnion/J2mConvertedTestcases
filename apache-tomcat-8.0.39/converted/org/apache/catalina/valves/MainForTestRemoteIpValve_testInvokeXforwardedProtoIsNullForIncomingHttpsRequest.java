package org.apache.catalina.valves;

import org.apache.catalina.valves.TestRemoteIpValve;

public class MainForTestRemoteIpValve_testInvokeXforwardedProtoIsNullForIncomingHttpsRequest {
    public static void main(String[] args) {
        try {
            TestRemoteIpValve objTestRemoteIpValve = new TestRemoteIpValve();
            objTestRemoteIpValve.testInvokeXforwardedProtoIsNullForIncomingHttpsRequest();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
