package com.javabycode.springboot;

import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorldController {
    @ApiOperation("A get Api returns static string without any request param")
    @RequestMapping(method = RequestMethod.GET, value = "/api/hello")
    public String sayHello() {
        return "Swagger Created by kavya";
    }
}
