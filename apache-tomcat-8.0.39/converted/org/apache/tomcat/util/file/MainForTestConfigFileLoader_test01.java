package org.apache.tomcat.util.file;

import org.apache.tomcat.util.file.TestConfigFileLoader;

public class MainForTestConfigFileLoader_test01 {
    public static void main(String[] args) {
        try {
            TestConfigFileLoader.setup();
            TestConfigFileLoader objTestConfigFileLoader = new TestConfigFileLoader();
            objTestConfigFileLoader.test01();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
