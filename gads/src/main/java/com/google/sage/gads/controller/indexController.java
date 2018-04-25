package com.google.sage.gads.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class indexController {

    @RequestMapping("/clicktobuy")
    public String greeting(Model model) {
//        model.addAttribute("name", name);
        return "clicktobuy/index";
    }
}
