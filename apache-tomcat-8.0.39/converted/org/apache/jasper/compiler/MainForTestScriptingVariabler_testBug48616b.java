package org.apache.jasper.compiler;

import org.apache.jasper.compiler.TestScriptingVariabler;

public class MainForTestScriptingVariabler_testBug48616b {
    public static void main(String[] args) {
        try {
            TestScriptingVariabler.setUpPerTestClass();
            TestScriptingVariabler objTestScriptingVariabler = new TestScriptingVariabler();
            objTestScriptingVariabler.setUp();
            objTestScriptingVariabler.testBug48616b();
            objTestScriptingVariabler.tearDown();
            TestScriptingVariabler.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
