package com.bit.app.demo;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController{

  @RequestMapping("/")
  public String index(){
    return "Hello Demo";
  }

}