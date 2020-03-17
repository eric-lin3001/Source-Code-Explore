package com.graphql.demolzy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoLzyApplication {

    public static void main(String[] args) {
        String[] names = {"ABC", "XYZ", "zoo"};
        names[1] = "cat";
        String s = names[1];
        names[1] = "rabbit";
        System.out.println(s); // s是"XYZ"还是"cat"?
        System.out.println(names[1]);

//        SpringApplication.run(DemoLzyApplication.class, args);
//        HelloWorld.helloWorld();
    }
}
