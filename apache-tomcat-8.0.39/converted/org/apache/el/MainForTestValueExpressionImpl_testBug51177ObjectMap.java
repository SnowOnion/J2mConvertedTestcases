package org.apache.el;

import org.apache.el.TestValueExpressionImpl;

public class MainForTestValueExpressionImpl_testBug51177ObjectMap {
    public static void main(String[] args) {
        try {
            TestValueExpressionImpl objTestValueExpressionImpl = new TestValueExpressionImpl();
            objTestValueExpressionImpl.testBug51177ObjectMap();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
