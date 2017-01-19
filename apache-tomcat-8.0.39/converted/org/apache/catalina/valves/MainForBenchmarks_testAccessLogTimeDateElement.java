package org.apache.catalina.valves;

import org.apache.catalina.valves.Benchmarks;

public class MainForBenchmarks_testAccessLogTimeDateElement {
    public static void main(String[] args) {
        try {
            Benchmarks objBenchmarks = new Benchmarks();
            objBenchmarks.testAccessLogTimeDateElement();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
