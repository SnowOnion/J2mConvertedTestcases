package org.apache.catalina.valves;

import org.apache.catalina.valves.TestRemoteIpValve;

public class MainForTestRemoteIpValve_testListToCommaDelimitedStringEmptyList {
    public static void main(String[] args) {
        try {
            TestRemoteIpValve objTestRemoteIpValve = new TestRemoteIpValve();
            objTestRemoteIpValve.testListToCommaDelimitedStringEmptyList();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
