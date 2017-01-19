package org.apache.catalina.valves;

import org.apache.catalina.valves.TestExtendedAccessLogValve;

public class MainForTestExtendedAccessLogValve_singleQuoteMiddle {
    public static void main(String[] args) {
        try {
            TestExtendedAccessLogValve objTestExtendedAccessLogValve = new TestExtendedAccessLogValve();
            objTestExtendedAccessLogValve.singleQuoteMiddle();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
