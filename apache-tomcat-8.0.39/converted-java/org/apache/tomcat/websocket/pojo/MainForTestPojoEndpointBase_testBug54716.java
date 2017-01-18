package org.apache.tomcat.websocket.pojo;

import org.apache.tomcat.websocket.pojo.TestPojoEndpointBase;

public class MainForTestPojoEndpointBase_testBug54716 {
	public static void main(String[] args) {
		try {
			new TestPojoEndpointBase().testBug54716();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}