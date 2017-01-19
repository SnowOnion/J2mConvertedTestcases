package org.apache.catalina.valves;

import org.apache.catalina.valves.TestRemoteIpValve;

public class MainForTestRemoteIpValve_testInvokeNotAllowedRemoteAddr {
    public static void main(String[] args) {
        try {
            TestRemoteIpValve objTestRemoteIpValve = new TestRemoteIpValve();
            objTestRemoteIpValve.testInvokeNotAllowedRemoteAddr();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
