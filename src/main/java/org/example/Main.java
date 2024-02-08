package org.example;

import org.example.aop.RecoverException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.lang.reflect.Method;
import java.util.Arrays;

@SpringBootApplication
public class Main {

    public static void main(String[] args) throws NoSuchMethodException {
        ApplicationContext context = SpringApplication.run(Main.class);
        TestClass testClass = context.getBean(TestClass.class);
        System.out.println(testClass.getRuntimeException1("Add"));
    }
}