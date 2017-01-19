package org.apache.tomcat.util.descriptor.web;

import org.apache.tomcat.util.descriptor.web.TestJspPropertyGroup;

public class MainForTestJspPropertyGroup_testBug55262 {
    public static void main(String[] args) {
        try {
            TestJspPropertyGroup objTestJspPropertyGroup = new TestJspPropertyGroup();
            objTestJspPropertyGroup.testBug55262();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
