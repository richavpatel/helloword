package com.hello.helloword;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("WriteText")
public class WriteText implements TextWriter {
    @Override
    public String writeText(String s) {
        return s + "Writer Text";
    }
}
