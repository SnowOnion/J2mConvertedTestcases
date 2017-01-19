package org.apache.tomcat.util.descriptor;

import org.apache.tomcat.util.descriptor.TestLocalResolver;

public class MainForTestLocalResolver_relativeSystemIdIsResolvedAgainstBaseURI {
    public static void main(String[] args) {
        try {
            TestLocalResolver objTestLocalResolver = new TestLocalResolver();
            objTestLocalResolver.init();
            objTestLocalResolver.relativeSystemIdIsResolvedAgainstBaseURI();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
