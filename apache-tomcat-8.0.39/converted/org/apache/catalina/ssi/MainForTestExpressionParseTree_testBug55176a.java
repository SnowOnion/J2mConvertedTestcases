package org.apache.catalina.ssi;

import org.apache.catalina.ssi.TestExpressionParseTree;

public class MainForTestExpressionParseTree_testBug55176a {
    public static void main(String[] args) {
        try {
            TestExpressionParseTree objTestExpressionParseTree = new TestExpressionParseTree();
            objTestExpressionParseTree.testBug55176a();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
