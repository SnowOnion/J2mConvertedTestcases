package org.apache.catalina.valves;

import org.apache.catalina.valves.TestRequestFilterValve;

public class MainForTestRequestFilterValve_testRemoteAddrValveIPv4 {
    public static void main(String[] args) {
        try {
            TestRequestFilterValve objTestRequestFilterValve = new TestRequestFilterValve();
            objTestRequestFilterValve.testRemoteAddrValveIPv4();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
