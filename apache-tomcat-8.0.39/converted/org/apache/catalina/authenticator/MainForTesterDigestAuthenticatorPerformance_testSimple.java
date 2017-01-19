package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TesterDigestAuthenticatorPerformance;

public class MainForTesterDigestAuthenticatorPerformance_testSimple {
    public static void main(String[] args) {
        try {
            TesterDigestAuthenticatorPerformance objTesterDigestAuthenticatorPerformance = new TesterDigestAuthenticatorPerformance();
            objTesterDigestAuthenticatorPerformance.setUp();
            objTesterDigestAuthenticatorPerformance.testSimple();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
