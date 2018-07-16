package com.example.eurekaservicefeign.controller;

import com.example.eurekaservicefeign.service.ScheduleServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wanghongen
 * @date 7/15/18 6:48 PM
 */
@RestController
public class HiController {

  @Autowired
  ScheduleServiceHi scheduleServiceHi;

  @RequestMapping(value = "/hi", method = RequestMethod.GET)
  public String sayHi(@RequestParam String name) {
    return scheduleServiceHi.sayHiFromClientOne(name);
  }

}
