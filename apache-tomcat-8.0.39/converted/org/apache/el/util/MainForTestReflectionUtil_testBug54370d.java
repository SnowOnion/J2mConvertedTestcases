package org.apache.el.util;

import org.apache.el.util.TestReflectionUtil;

public class MainForTestReflectionUtil_testBug54370d {
    public static void main(String[] args) {
        try {
            TestReflectionUtil objTestReflectionUtil = new TestReflectionUtil();
            objTestReflectionUtil.testBug54370d();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
