package org.apache.catalina.valves;

import org.apache.catalina.valves.TestRequestFilterValve;

public class MainForTestRequestFilterValve_testRemoteHostValve {
    public static void main(String[] args) {
        try {
            TestRequestFilterValve objTestRequestFilterValve = new TestRequestFilterValve();
            objTestRequestFilterValve.testRemoteHostValve();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
