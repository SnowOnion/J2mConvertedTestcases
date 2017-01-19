package org.apache.catalina.realm;

import org.apache.catalina.realm.TestGenericPrincipal;

public class MainForTestGenericPrincipal_testSerialize01 {
    public static void main(String[] args) {
        try {
            TestGenericPrincipal objTestGenericPrincipal = new TestGenericPrincipal();
            objTestGenericPrincipal.testSerialize01();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
