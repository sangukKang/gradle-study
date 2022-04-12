package com.grd.study.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/test")
public class TestController {

    @GetMapping("/info")
    public Map<String, Object> getTestInfo() {
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("key", "1");
        resultMap.put("value", "study");
        return resultMap;
    }
}
