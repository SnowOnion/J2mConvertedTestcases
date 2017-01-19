package org.apache.tomcat.util.descriptor;

import org.apache.tomcat.util.descriptor.TestLocalResolver;

public class MainForTestLocalResolver_unknownSystemId {
    public static void main(String[] args) {
        try {
            TestLocalResolver objTestLocalResolver = new TestLocalResolver();
            objTestLocalResolver.init();
            objTestLocalResolver.unknownSystemId();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
