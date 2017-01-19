package org.apache.el;

import org.apache.el.TestELEvaluation;

public class MainForTestELEvaluation_testBug49081c {
    public static void main(String[] args) {
        try {
            TestELEvaluation objTestELEvaluation = new TestELEvaluation();
            objTestELEvaluation.testBug49081c();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
