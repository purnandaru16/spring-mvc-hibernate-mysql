package com.bootcamp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * The Class HomeController
 *
 * @author Kris Sunu Purnandaru
 */

@Controller
public class HomeController {
    @RequestMapping(value = "/")
    public ModelAndView home(ModelAndView model) {
        model.setViewName("home");
        return model;
    }
}
