package org.apache.el.util;

import org.apache.el.util.TestReflectionUtil;

public class MainForTestReflectionUtil_testBug54370c {
    public static void main(String[] args) {
        try {
            TestReflectionUtil objTestReflectionUtil = new TestReflectionUtil();
            objTestReflectionUtil.testBug54370c();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
