package org.apache.catalina.valves;

import org.apache.catalina.valves.TestRemoteIpValve;

public class MainForTestRemoteIpValve_testInvokeAllowedRemoteAddrWithNullRemoteIpHeader {
    public static void main(String[] args) {
        try {
            TestRemoteIpValve objTestRemoteIpValve = new TestRemoteIpValve();
            objTestRemoteIpValve.testInvokeAllowedRemoteAddrWithNullRemoteIpHeader();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
