package org.apache.el;

import org.apache.el.TestELEvaluation;

public class MainForTestELEvaluation_testBug44994 {
    public static void main(String[] args) {
        try {
            TestELEvaluation objTestELEvaluation = new TestELEvaluation();
            objTestELEvaluation.testBug44994();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
