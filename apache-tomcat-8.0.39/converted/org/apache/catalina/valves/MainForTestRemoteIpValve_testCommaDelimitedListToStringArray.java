package org.apache.catalina.valves;

import org.apache.catalina.valves.TestRemoteIpValve;

public class MainForTestRemoteIpValve_testCommaDelimitedListToStringArray {
    public static void main(String[] args) {
        try {
            TestRemoteIpValve objTestRemoteIpValve = new TestRemoteIpValve();
            objTestRemoteIpValve.testCommaDelimitedListToStringArray();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
