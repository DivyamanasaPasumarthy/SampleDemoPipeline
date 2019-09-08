package com.example.demo.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * This class provides the functionality for the justice league tracker.
 *
 * @author dinuka
 */
@Service
public class SampleServiceImpl implements SampleService {

    private static Logger log = LoggerFactory.getLogger(SampleService.class);

    @Override
    public List<String> getDevopsTools() {
        log.info("Received a request to get all the Devops Tools");
        return populateList();
    }

    private List<String> populateList() {
        List<String> toolList = new ArrayList<String>();
        toolList.add("Ansible");
		return toolList;
       
    }
}
