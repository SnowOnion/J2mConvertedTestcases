package org.apache.tomcat.util.http;

import org.apache.tomcat.util.http.TesterCookiesPerformance;

public class MainForTesterCookiesPerformance_testPerformance01 {
	public static void main(String[] args) {
		try {
			new TesterCookiesPerformance().testPerformance01();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}