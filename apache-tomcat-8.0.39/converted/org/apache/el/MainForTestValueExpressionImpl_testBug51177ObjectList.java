package org.apache.el;

import org.apache.el.TestValueExpressionImpl;

public class MainForTestValueExpressionImpl_testBug51177ObjectList {
    public static void main(String[] args) {
        try {
            TestValueExpressionImpl objTestValueExpressionImpl = new TestValueExpressionImpl();
            objTestValueExpressionImpl.testBug51177ObjectList();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
