package com.cs.pts.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/pts")
public class PtsController {

    @GetMapping("demo")
    public ResponseEntity<String> getDemoResult() {

        return new ResponseEntity<>("This is working", HttpStatus.OK);
    }

}
