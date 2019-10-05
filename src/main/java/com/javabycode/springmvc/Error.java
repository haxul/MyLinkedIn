package com.javabycode.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/error")
public class Error {

    @RequestMapping(value = "/404", method = RequestMethod.GET)
    public String set404() {
        return "error404";
    }
}
