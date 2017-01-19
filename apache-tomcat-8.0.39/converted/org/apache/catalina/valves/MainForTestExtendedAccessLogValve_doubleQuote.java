package org.apache.catalina.valves;

import org.apache.catalina.valves.TestExtendedAccessLogValve;

public class MainForTestExtendedAccessLogValve_doubleQuote {
    public static void main(String[] args) {
        try {
            TestExtendedAccessLogValve objTestExtendedAccessLogValve = new TestExtendedAccessLogValve();
            objTestExtendedAccessLogValve.doubleQuote();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
