package org.apache.el.lang;

import org.apache.el.lang.TestELArithmetic;

public class MainForTestELArithmetic_testBug47371bigInteger {
    public static void main(String[] args) {
        try {
            TestELArithmetic objTestELArithmetic = new TestELArithmetic();
            objTestELArithmetic.testBug47371bigInteger();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
