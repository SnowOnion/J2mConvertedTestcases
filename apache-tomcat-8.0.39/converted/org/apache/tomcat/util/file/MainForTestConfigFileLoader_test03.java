package org.apache.tomcat.util.file;

import org.apache.tomcat.util.file.TestConfigFileLoader;

public class MainForTestConfigFileLoader_test03 {
    public static void main(String[] args) {
        try {
            TestConfigFileLoader.setup();
            TestConfigFileLoader objTestConfigFileLoader = new TestConfigFileLoader();
            objTestConfigFileLoader.test03();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
