package com.wade.springboot.springboot_feature_demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wade.springboot.springboot_feature_demo.Model.Course;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, Spring Boot!";
    }

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses() {
        return List.of(
                new Course(1, "Learn AWS", "wade"),
                new Course(2, "Learn DevOps", "wade"),
                new Course(3, "Learn Azure", "wade"),
                new Course(4, "Learn GCP", "wade"));
    }

}
