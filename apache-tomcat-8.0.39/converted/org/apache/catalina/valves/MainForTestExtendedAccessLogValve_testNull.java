package org.apache.catalina.valves;

import org.apache.catalina.valves.TestExtendedAccessLogValve;

public class MainForTestExtendedAccessLogValve_testNull {
    public static void main(String[] args) {
        try {
            TestExtendedAccessLogValve objTestExtendedAccessLogValve = new TestExtendedAccessLogValve();
            objTestExtendedAccessLogValve.testNull();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
