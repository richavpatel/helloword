package com.hello.helloword;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("RegWriter")
public class RegWriter implements TextWriter {
    @Override
    public String writeText(String s) {
        return s + "Regular Writer";
    }
}
