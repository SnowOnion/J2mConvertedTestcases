package org.apache.jasper.compiler;

import org.apache.jasper.compiler.TestScriptingVariabler;

public class MainForTestScriptingVariabler_testBug42390 {
    public static void main(String[] args) {
        try {
            TestScriptingVariabler.setUpPerTestClass();
            TestScriptingVariabler objTestScriptingVariabler = new TestScriptingVariabler();
            objTestScriptingVariabler.setUp();
            objTestScriptingVariabler.testBug42390();
            objTestScriptingVariabler.tearDown();
            TestScriptingVariabler.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
