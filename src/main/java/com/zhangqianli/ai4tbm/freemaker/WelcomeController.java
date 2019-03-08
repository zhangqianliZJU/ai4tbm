package com.zhangqianli.ai4tbm.freemaker;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
@EnableAutoConfiguration
public class WelcomeController {
    @RequestMapping("/hello")
    public ModelAndView welcome(ModelAndView mv){
        mv.addObject("msg","This is my first freemaker application!");
        mv.setViewName("hello");
        return mv;
    }
    @RequestMapping("/index")
    public ModelAndView index(ModelAndView mv){
        mv.addObject("info","It is a nice world!");
        mv.setViewName("index");
        return mv;
    }
}
