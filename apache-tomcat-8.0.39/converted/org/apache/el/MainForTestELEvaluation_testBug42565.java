package org.apache.el;

import org.apache.el.TestELEvaluation;

public class MainForTestELEvaluation_testBug42565 {
    public static void main(String[] args) {
        try {
            TestELEvaluation objTestELEvaluation = new TestELEvaluation();
            objTestELEvaluation.testBug42565();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
