package com.ligt.nacos.consumer.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ligt
 * @date 2021-10-29-11:26
 */
@RestController
@RequestMapping("/echo/")
public class EchoController {


    @GetMapping("get")
    public ResponseEntity<Object> echo() {
        Map<String, Object> data = new HashMap<>(2);
        data.put("name", "ligt");
        data.put("age", 22);
        return new ResponseEntity<>(data, HttpStatus.OK);
    }

}
