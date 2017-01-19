package org.apache.el;

import org.apache.el.TestELEvaluation;

public class MainForTestELEvaluation_testBug49081b {
    public static void main(String[] args) {
        try {
            TestELEvaluation objTestELEvaluation = new TestELEvaluation();
            objTestELEvaluation.testBug49081b();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
