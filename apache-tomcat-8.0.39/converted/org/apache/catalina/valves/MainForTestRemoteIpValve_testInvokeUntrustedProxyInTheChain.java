package org.apache.catalina.valves;

import org.apache.catalina.valves.TestRemoteIpValve;

public class MainForTestRemoteIpValve_testInvokeUntrustedProxyInTheChain {
    public static void main(String[] args) {
        try {
            TestRemoteIpValve objTestRemoteIpValve = new TestRemoteIpValve();
            objTestRemoteIpValve.testInvokeUntrustedProxyInTheChain();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
