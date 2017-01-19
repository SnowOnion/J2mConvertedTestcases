package org.apache.catalina.valves;

import org.apache.catalina.valves.TestRemoteIpValve;

public class MainForTestRemoteIpValve_testListToCommaDelimitedString {
    public static void main(String[] args) {
        try {
            TestRemoteIpValve objTestRemoteIpValve = new TestRemoteIpValve();
            objTestRemoteIpValve.testListToCommaDelimitedString();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
