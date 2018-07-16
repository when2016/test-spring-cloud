package com.example.eurekaserviceribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author wanghongen
 * @date 7/15/18 6:02 PM
 */
@Service
public class HelloService {

  @Autowired
  private RestTemplate restTemplate;

//  @HystrixCommand
  public String hiService(String name) {
    return restTemplate.getForObject("http://SERVICE-HI/hi?name=" + name, String.class);
  }

}
