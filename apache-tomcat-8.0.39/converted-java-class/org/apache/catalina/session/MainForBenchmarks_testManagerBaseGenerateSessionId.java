package org.apache.catalina.session;

import org.apache.catalina.session.Benchmarks;

public class MainForBenchmarks_testManagerBaseGenerateSessionId {
	public static void main(String[] args) {
		try {
			new Benchmarks().testManagerBaseGenerateSessionId();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}