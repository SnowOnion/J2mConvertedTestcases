package org.apache.catalina.session;

import org.apache.catalina.session.Threading;

public class MainForThreading_testFileInputStream {
    public static void main(String[] args) {
        try {
            Threading objThreading = new Threading();
            objThreading.testFileInputStream();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
