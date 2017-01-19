package org.apache.catalina.valves;

import org.apache.catalina.valves.TestRemoteIpValve;

public class MainForTestRemoteIpValve_testInvokeAllProxiesAreTrustedAndRemoteAddrMatchRegexp {
    public static void main(String[] args) {
        try {
            TestRemoteIpValve objTestRemoteIpValve = new TestRemoteIpValve();
            objTestRemoteIpValve.testInvokeAllProxiesAreTrustedAndRemoteAddrMatchRegexp();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
