package org.apache.el;

import org.apache.el.TestELEvaluation;

public class MainForTestELEvaluation_testMixedTypes {
    public static void main(String[] args) {
        try {
            TestELEvaluation objTestELEvaluation = new TestELEvaluation();
            objTestELEvaluation.testMixedTypes();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
