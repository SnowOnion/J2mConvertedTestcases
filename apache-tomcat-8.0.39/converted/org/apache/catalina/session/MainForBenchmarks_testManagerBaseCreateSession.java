package org.apache.catalina.session;

import org.apache.catalina.session.Benchmarks;

public class MainForBenchmarks_testManagerBaseCreateSession {
    public static void main(String[] args) {
        try {
            Benchmarks objBenchmarks = new Benchmarks();
            objBenchmarks.testManagerBaseCreateSession();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
