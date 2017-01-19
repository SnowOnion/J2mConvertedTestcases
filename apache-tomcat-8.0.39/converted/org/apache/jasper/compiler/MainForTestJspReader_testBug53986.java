package org.apache.jasper.compiler;

import org.apache.jasper.compiler.TestJspReader;

public class MainForTestJspReader_testBug53986 {
    public static void main(String[] args) {
        try {
            TestJspReader.setUpPerTestClass();
            TestJspReader objTestJspReader = new TestJspReader();
            objTestJspReader.setUp();
            objTestJspReader.testBug53986();
            objTestJspReader.tearDown();
            TestJspReader.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
