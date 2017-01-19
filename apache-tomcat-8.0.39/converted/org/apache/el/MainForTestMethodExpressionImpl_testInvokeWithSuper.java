package org.apache.el;

import org.apache.el.TestMethodExpressionImpl;

public class MainForTestMethodExpressionImpl_testInvokeWithSuper {
    public static void main(String[] args) {
        try {
            TestMethodExpressionImpl objTestMethodExpressionImpl = new TestMethodExpressionImpl();
            objTestMethodExpressionImpl.setUp();
            objTestMethodExpressionImpl.testInvokeWithSuper();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
