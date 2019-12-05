package com.hello.helloword;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @Autowired
    @Qualifier("RegWriter")
    TextWriter regWriter;

    @Autowired
    @Qualifier("WriteText")
    TextWriter Writer;

    @RequestMapping("/")
    public String write(){
        return regWriter.writeText("called!");
    }




}
