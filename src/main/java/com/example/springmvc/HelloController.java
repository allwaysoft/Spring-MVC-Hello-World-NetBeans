/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.springmvc;

/**
 *
 * @author muqui
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @RequestMapping("/helloworld")
    public ModelAndView hello() {

        String helloWorldMessage = "Hello world!";
        return new ModelAndView("hello", "message", helloWorldMessage);
    }
}
