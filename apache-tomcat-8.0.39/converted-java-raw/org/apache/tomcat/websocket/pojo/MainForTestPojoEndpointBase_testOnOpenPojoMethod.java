package org.apache.tomcat.websocket.pojo;

import org.apache.tomcat.websocket.pojo.TestPojoEndpointBase;

public class MainForTestPojoEndpointBase_testOnOpenPojoMethod {
	public static void main(String[] args) {
		try {
			new TestPojoEndpointBase().testOnOpenPojoMethod();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}