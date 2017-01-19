package org.apache.el;

import org.apache.el.TestValueExpressionImpl;

public class MainForTestValueExpressionImpl_testBug56522SetNullValue {
    public static void main(String[] args) {
        try {
            TestValueExpressionImpl objTestValueExpressionImpl = new TestValueExpressionImpl();
            objTestValueExpressionImpl.testBug56522SetNullValue();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
