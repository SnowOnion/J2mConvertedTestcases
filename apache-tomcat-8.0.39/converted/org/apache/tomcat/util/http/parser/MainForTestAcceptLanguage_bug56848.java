package org.apache.tomcat.util.http.parser;

import org.apache.tomcat.util.http.parser.TestAcceptLanguage;

public class MainForTestAcceptLanguage_bug56848 {
    public static void main(String[] args) {
        try {
            TestAcceptLanguage objTestAcceptLanguage = new TestAcceptLanguage();
            objTestAcceptLanguage.bug56848();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
