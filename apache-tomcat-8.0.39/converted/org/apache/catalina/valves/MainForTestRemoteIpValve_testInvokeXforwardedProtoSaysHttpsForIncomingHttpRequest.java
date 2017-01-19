package org.apache.catalina.valves;

import org.apache.catalina.valves.TestRemoteIpValve;

public class MainForTestRemoteIpValve_testInvokeXforwardedProtoSaysHttpsForIncomingHttpRequest {
    public static void main(String[] args) {
        try {
            TestRemoteIpValve objTestRemoteIpValve = new TestRemoteIpValve();
            objTestRemoteIpValve.testInvokeXforwardedProtoSaysHttpsForIncomingHttpRequest();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
