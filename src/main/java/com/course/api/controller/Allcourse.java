package com.course.api.myapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/courses")
public class Allcourse {

    @GetMapping("/allcourse")

    public String getAllCourse(){
        return "all course";
    }
}
