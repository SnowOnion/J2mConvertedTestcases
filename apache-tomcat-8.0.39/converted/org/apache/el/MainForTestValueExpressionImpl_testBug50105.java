package org.apache.el;

import org.apache.el.TestValueExpressionImpl;

public class MainForTestValueExpressionImpl_testBug50105 {
    public static void main(String[] args) {
        try {
            TestValueExpressionImpl objTestValueExpressionImpl = new TestValueExpressionImpl();
            objTestValueExpressionImpl.testBug50105();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
