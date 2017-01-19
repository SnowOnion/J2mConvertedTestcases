package org.apache.tomcat.util.descriptor.web;

import org.apache.tomcat.util.descriptor.web.TestJspConfigDescriptorImpl;

public class MainForTestJspConfigDescriptorImpl_testTaglibsAreIsolate {
    public static void main(String[] args) {
        try {
            TestJspConfigDescriptorImpl objTestJspConfigDescriptorImpl = new TestJspConfigDescriptorImpl();
            objTestJspConfigDescriptorImpl.testTaglibsAreIsolate();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
