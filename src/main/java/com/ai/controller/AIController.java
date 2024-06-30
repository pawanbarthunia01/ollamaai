package com.ai.controller;

import com.ai.service.AIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class AIController {
     @Autowired
    private AIService service;
@GetMapping("/")
    public Map embidingDetail(@RequestParam(value = "message", defaultValue = "Tell me a joke") String message) {
      return service.embed(message);
      }


}
