package org.apache.catalina.valves;

import org.apache.catalina.valves.TestRemoteIpValve;

public class MainForTestRemoteIpValve_testInvokeAllProxiesAreTrustedOrInternal {
    public static void main(String[] args) {
        try {
            TestRemoteIpValve objTestRemoteIpValve = new TestRemoteIpValve();
            objTestRemoteIpValve.testInvokeAllProxiesAreTrustedOrInternal();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
