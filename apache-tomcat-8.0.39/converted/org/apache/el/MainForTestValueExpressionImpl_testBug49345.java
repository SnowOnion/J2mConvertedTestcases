package org.apache.el;

import org.apache.el.TestValueExpressionImpl;

public class MainForTestValueExpressionImpl_testBug49345 {
    public static void main(String[] args) {
        try {
            TestValueExpressionImpl objTestValueExpressionImpl = new TestValueExpressionImpl();
            objTestValueExpressionImpl.testBug49345();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
