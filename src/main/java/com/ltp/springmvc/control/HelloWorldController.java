package com.ltp.springmvc.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Controller
@RequestMapping
public class HelloWorldController {

    @RequestMapping(value = {"", "/index"}, method = {RequestMethod.GET})
    public ModelAndView hello() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("time", new Date().toString());
        return modelAndView;
    }

    @RequestMapping(value = {"/login"}, method = {RequestMethod.POST})
    public ModelAndView login(HttpServletRequest req) {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");
        modelAndView.addObject("username", username);
        return modelAndView;
    }

}
