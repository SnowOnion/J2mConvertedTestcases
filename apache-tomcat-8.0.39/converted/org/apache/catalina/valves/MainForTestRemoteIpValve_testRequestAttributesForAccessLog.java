package org.apache.catalina.valves;

import org.apache.catalina.valves.TestRemoteIpValve;

public class MainForTestRemoteIpValve_testRequestAttributesForAccessLog {
    public static void main(String[] args) {
        try {
            TestRemoteIpValve objTestRemoteIpValve = new TestRemoteIpValve();
            objTestRemoteIpValve.testRequestAttributesForAccessLog();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
