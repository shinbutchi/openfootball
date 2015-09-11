package com.shin.spring.openfootball.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by shin on 9/10/2015.
 */
@Controller
public class HomeController {
    @RequestMapping(value = "/ping", method = RequestMethod.POST)
    @ResponseBody
    public String ping() {
        return "pong";
    }
}
