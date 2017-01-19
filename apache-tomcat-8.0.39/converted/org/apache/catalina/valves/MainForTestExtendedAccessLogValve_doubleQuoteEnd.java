package org.apache.catalina.valves;

import org.apache.catalina.valves.TestExtendedAccessLogValve;

public class MainForTestExtendedAccessLogValve_doubleQuoteEnd {
    public static void main(String[] args) {
        try {
            TestExtendedAccessLogValve objTestExtendedAccessLogValve = new TestExtendedAccessLogValve();
            objTestExtendedAccessLogValve.doubleQuoteEnd();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
