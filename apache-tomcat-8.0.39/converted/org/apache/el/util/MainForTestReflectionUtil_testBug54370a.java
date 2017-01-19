package org.apache.el.util;

import org.apache.el.util.TestReflectionUtil;

public class MainForTestReflectionUtil_testBug54370a {
    public static void main(String[] args) {
        try {
            TestReflectionUtil objTestReflectionUtil = new TestReflectionUtil();
            objTestReflectionUtil.testBug54370a();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
