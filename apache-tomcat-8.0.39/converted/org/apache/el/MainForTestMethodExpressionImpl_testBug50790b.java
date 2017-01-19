package org.apache.el;

import org.apache.el.TestMethodExpressionImpl;

public class MainForTestMethodExpressionImpl_testBug50790b {
    public static void main(String[] args) {
        try {
            TestMethodExpressionImpl objTestMethodExpressionImpl = new TestMethodExpressionImpl();
            objTestMethodExpressionImpl.setUp();
            objTestMethodExpressionImpl.testBug50790b();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
