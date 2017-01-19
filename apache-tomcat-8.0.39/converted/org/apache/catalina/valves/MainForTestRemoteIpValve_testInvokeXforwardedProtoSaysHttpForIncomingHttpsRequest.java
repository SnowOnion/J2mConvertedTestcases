package org.apache.catalina.valves;

import org.apache.catalina.valves.TestRemoteIpValve;

public class MainForTestRemoteIpValve_testInvokeXforwardedProtoSaysHttpForIncomingHttpsRequest {
    public static void main(String[] args) {
        try {
            TestRemoteIpValve objTestRemoteIpValve = new TestRemoteIpValve();
            objTestRemoteIpValve.testInvokeXforwardedProtoSaysHttpForIncomingHttpsRequest();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
