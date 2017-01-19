package org.apache.catalina.valves;

import org.apache.catalina.valves.TestRemoteIpValve;

public class MainForTestRemoteIpValve_testCommaDelimitedListToStringArrayMixedSpaceChars {
    public static void main(String[] args) {
        try {
            TestRemoteIpValve objTestRemoteIpValve = new TestRemoteIpValve();
            objTestRemoteIpValve.testCommaDelimitedListToStringArrayMixedSpaceChars();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
