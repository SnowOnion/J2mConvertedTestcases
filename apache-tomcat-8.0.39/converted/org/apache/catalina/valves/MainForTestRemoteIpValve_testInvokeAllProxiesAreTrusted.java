package org.apache.catalina.valves;

import org.apache.catalina.valves.TestRemoteIpValve;

public class MainForTestRemoteIpValve_testInvokeAllProxiesAreTrusted {
    public static void main(String[] args) {
        try {
            TestRemoteIpValve objTestRemoteIpValve = new TestRemoteIpValve();
            objTestRemoteIpValve.testInvokeAllProxiesAreTrusted();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
