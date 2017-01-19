package org.apache.catalina.session;

import org.apache.catalina.session.Benchmarks;

public class MainForBenchmarks_testSecureRandomVsDevURandom {
    public static void main(String[] args) {
        try {
            Benchmarks objBenchmarks = new Benchmarks();
            objBenchmarks.testSecureRandomVsDevURandom();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
