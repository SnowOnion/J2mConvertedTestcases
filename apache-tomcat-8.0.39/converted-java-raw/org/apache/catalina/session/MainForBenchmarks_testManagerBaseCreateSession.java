package org.apache.catalina.session;

import org.apache.catalina.session.Benchmarks;

public class MainForBenchmarks_testManagerBaseCreateSession {
	public static void main(String[] args) {
		try {
			new Benchmarks().testManagerBaseCreateSession();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}