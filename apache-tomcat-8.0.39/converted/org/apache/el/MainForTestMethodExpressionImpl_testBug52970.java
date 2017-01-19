package org.apache.el;

import org.apache.el.TestMethodExpressionImpl;

public class MainForTestMethodExpressionImpl_testBug52970 {
    public static void main(String[] args) {
        try {
            TestMethodExpressionImpl objTestMethodExpressionImpl = new TestMethodExpressionImpl();
            objTestMethodExpressionImpl.setUp();
            objTestMethodExpressionImpl.testBug52970();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
