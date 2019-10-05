package com.javabycode.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/profile")
public class UserProfile {

    @RequestMapping(method = RequestMethod.GET)
    public String getUser() {
        return "userProfile";
    }
}
