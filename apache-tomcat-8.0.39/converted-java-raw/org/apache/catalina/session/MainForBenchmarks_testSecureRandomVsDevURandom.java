package org.apache.catalina.session;

import org.apache.catalina.session.Benchmarks;

public class MainForBenchmarks_testSecureRandomVsDevURandom {
	public static void main(String[] args) {
		try {
			new Benchmarks().testSecureRandomVsDevURandom();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}