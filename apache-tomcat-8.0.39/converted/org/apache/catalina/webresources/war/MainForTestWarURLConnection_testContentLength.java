package org.apache.catalina.webresources.war;

import org.apache.catalina.webresources.war.TestWarURLConnection;

public class MainForTestWarURLConnection_testContentLength {
    public static void main(String[] args) {
        try {
            TestWarURLConnection objTestWarURLConnection = new TestWarURLConnection();
            objTestWarURLConnection.register();
            objTestWarURLConnection.testContentLength();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
