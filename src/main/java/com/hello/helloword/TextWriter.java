package com.hello.helloword;

import org.springframework.stereotype.Component;

@Component
public interface TextWriter {

    public String writeText(String s);
}
