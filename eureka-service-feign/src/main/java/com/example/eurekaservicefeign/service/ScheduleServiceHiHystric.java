package com.example.eurekaservicefeign.service;

import org.springframework.stereotype.Component;

/**
 * @author wanghongen
 * @date 7/15/18 7:53 PM
 */
@Component
public class ScheduleServiceHiHystric implements ScheduleServiceHi {

  @Override
  public String sayHiFromClientOne(String name) {
    return "sorry " + name;
  }
}
