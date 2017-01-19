package org.apache.jasper;

import org.apache.jasper.TestJspC;

public class MainForTestJspC_precompileWebapp_2_2 {
    public static void main(String[] args) {
        try {
            TestJspC objTestJspC = new TestJspC();
            objTestJspC.init();
            objTestJspC.precompileWebapp_2_2();
            objTestJspC.cleanup();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
