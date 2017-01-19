package org.apache.catalina.valves;

import org.apache.catalina.valves.Benchmarks;

public class MainForBenchmarks_testAccessLogGetDate {
    public static void main(String[] args) {
        try {
            Benchmarks objBenchmarks = new Benchmarks();
            objBenchmarks.testAccessLogGetDate();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
