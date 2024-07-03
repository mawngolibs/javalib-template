package io.x10.pushtimize.template;

import lombok.experimental.UtilityClass;

@UtilityClass
public class HelloWorldUtils {
    public String sayHello(String name) {
        return "Hello " + name + "!";
    }
}
