package com.example.eurekaserviceribbon.controller;

import com.example.eurekaserviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wanghongen
 * @date 7/15/18 6:05 PM
 */
@RestController
public class HelloController {

  @Autowired
  private HelloService helloService;

  @GetMapping(value = "/hi")
  public String hi(@RequestParam String name) {
    return helloService.hiService(name);
  }

}
