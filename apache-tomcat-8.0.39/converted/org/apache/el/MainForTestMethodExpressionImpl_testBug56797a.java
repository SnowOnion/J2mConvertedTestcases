package org.apache.el;

import org.apache.el.TestMethodExpressionImpl;

public class MainForTestMethodExpressionImpl_testBug56797a {
    public static void main(String[] args) {
        try {
            TestMethodExpressionImpl objTestMethodExpressionImpl = new TestMethodExpressionImpl();
            objTestMethodExpressionImpl.setUp();
            objTestMethodExpressionImpl.testBug56797a();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
