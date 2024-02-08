package org.example;

import org.example.aop.RecoverException;
import org.springframework.stereotype.Component;
import org.w3c.dom.events.EventException;

@Component
public class TestClass {

    @RecoverException(noRecoverFor = {RuntimeException.class,EventException.class})
    public int getRuntimeException1(String str) {
        throw new IllegalArgumentException("HI!");
    }
}
