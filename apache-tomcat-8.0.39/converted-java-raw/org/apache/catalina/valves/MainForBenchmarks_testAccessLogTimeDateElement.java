package org.apache.catalina.valves;

import org.apache.catalina.valves.Benchmarks;

public class MainForBenchmarks_testAccessLogTimeDateElement {
	public static void main(String[] args) {
		try {
			new Benchmarks().testAccessLogTimeDateElement();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}