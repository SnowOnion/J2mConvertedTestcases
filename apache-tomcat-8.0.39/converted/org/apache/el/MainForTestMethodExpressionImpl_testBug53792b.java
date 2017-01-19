package org.apache.el;

import org.apache.el.TestMethodExpressionImpl;

public class MainForTestMethodExpressionImpl_testBug53792b {
    public static void main(String[] args) {
        try {
            TestMethodExpressionImpl objTestMethodExpressionImpl = new TestMethodExpressionImpl();
            objTestMethodExpressionImpl.setUp();
            objTestMethodExpressionImpl.testBug53792b();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
