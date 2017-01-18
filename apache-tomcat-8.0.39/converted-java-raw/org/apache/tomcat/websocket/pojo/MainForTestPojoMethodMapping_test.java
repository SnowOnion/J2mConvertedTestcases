package org.apache.tomcat.websocket.pojo;

import org.apache.tomcat.websocket.pojo.TestPojoMethodMapping;

public class MainForTestPojoMethodMapping_test {
	public static void main(String[] args) {
		try {
			new TestPojoMethodMapping().test();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}