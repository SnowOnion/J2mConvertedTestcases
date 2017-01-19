package org.apache.catalina.valves;

import org.apache.catalina.valves.TestAccessLogValve;

public class MainForTestAccessLogValve_testBug54044 {
    public static void main(String[] args) {
        try {
            TestAccessLogValve objTestAccessLogValve = new TestAccessLogValve();
            objTestAccessLogValve.testBug54044();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
