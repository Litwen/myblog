package com.my.blog.controller.Admin;

import org.apache.xpath.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminController {

    @RequestMapping("/login")
    public ModelAndView  login(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/Admin/login");
        return modelAndView;
    }

}
