package com.zhangqianli.ai4tbm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class Ai4tbmApplication {
    private static int i=1;
    @RequestMapping("/")
    String home(){
        return "Hello world!" + (i++);
    }
    @RequestMapping("/geological condition")
    String geoConditionPage(){
        return "This is the geological condition recognition module.";
    }
    @RequestMapping("/performance prediction")
    String performancePrediction(){
        return "This is the performance prediction module.";
    }
    @RequestMapping("/debris analysis")
    String debrisAnalysis(){
        return "This is the debris analysis module";
    }
    @RequestMapping("/data visualization")
    String dataVisualization(){
        return "This is the data visualization module.";
    }
    /*public static void main(String[] args) {
        System.out.println("Hello world!");
        SpringApplication.run(Ai4tbmApplication.class, args);
    }*/

}
