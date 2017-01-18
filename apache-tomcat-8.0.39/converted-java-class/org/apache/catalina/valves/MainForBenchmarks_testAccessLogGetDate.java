package org.apache.catalina.valves;

import org.apache.catalina.valves.Benchmarks;

public class MainForBenchmarks_testAccessLogGetDate {
	public static void main(String[] args) {
		try {
			new Benchmarks().testAccessLogGetDate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}