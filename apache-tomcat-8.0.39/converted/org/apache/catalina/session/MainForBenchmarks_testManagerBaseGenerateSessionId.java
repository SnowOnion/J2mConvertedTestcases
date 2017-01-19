package org.apache.catalina.session;

import org.apache.catalina.session.Benchmarks;

public class MainForBenchmarks_testManagerBaseGenerateSessionId {
    public static void main(String[] args) {
        try {
            Benchmarks objBenchmarks = new Benchmarks();
            objBenchmarks.testManagerBaseGenerateSessionId();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
