package org.apache.jasper.compiler;

import org.apache.jasper.compiler.TesterValidator;

public class MainForTesterValidator_testBug53867 {
    public static void main(String[] args) {
        try {
            TesterValidator objTesterValidator = new TesterValidator();
            objTesterValidator.testBug53867();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
