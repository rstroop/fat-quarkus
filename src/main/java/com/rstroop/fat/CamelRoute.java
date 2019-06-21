package com.rstroop.fat;

import org.apache.camel.builder.RouteBuilder;

/**
 * CamelRoute
 */
public class CamelRoute extends RouteBuilder{

    public void configure(){
        from("timer:fat?period=5s")
            .process(new ComboProcessor())
            .to("class:com.rstroop.fat.ComboResource?method=add")
            //.setBody().simple("Hello Quarkus")
            .log("${body}");
    }
    
}