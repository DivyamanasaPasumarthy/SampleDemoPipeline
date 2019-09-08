package com.example.demo.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.SampleService;

/**
 * This class will be the controller exposing the API's needed
 *
 * @author 
 */
@RestController
@RequestMapping("/v1/jl")
public class SampleController {

    private static Logger log = LoggerFactory.getLogger(SampleController.class);

    @Autowired
    private SampleService service;

    @ResponseBody
    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<String> getDevopsTools() {
        log.info("Received a request to retrive the name");
        return service.getDevopsTools();
    }
}
