package org.apache.catalina.ssi;

import org.apache.catalina.ssi.TestExpressionParseTree;

public class MainForTestExpressionParseTree_testBug55176b {
    public static void main(String[] args) {
        try {
            TestExpressionParseTree objTestExpressionParseTree = new TestExpressionParseTree();
            objTestExpressionParseTree.testBug55176b();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
