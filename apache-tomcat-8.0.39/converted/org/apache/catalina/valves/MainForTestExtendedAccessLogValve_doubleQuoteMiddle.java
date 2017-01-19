package org.apache.catalina.valves;

import org.apache.catalina.valves.TestExtendedAccessLogValve;

public class MainForTestExtendedAccessLogValve_doubleQuoteMiddle {
    public static void main(String[] args) {
        try {
            TestExtendedAccessLogValve objTestExtendedAccessLogValve = new TestExtendedAccessLogValve();
            objTestExtendedAccessLogValve.doubleQuoteMiddle();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
