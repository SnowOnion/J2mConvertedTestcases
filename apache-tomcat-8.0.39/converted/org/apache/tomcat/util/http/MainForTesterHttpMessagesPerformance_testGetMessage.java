package org.apache.tomcat.util.http;

import org.apache.tomcat.util.http.TesterHttpMessagesPerformance;

public class MainForTesterHttpMessagesPerformance_testGetMessage {
    public static void main(String[] args) {
        try {
            TesterHttpMessagesPerformance objTesterHttpMessagesPerformance = new TesterHttpMessagesPerformance();
            objTesterHttpMessagesPerformance.testGetMessage();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
