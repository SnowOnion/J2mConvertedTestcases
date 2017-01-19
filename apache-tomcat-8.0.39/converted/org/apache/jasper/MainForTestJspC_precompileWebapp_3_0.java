package org.apache.jasper;

import org.apache.jasper.TestJspC;

public class MainForTestJspC_precompileWebapp_3_0 {
    public static void main(String[] args) {
        try {
            TestJspC objTestJspC = new TestJspC();
            objTestJspC.init();
            objTestJspC.precompileWebapp_3_0();
            objTestJspC.cleanup();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
