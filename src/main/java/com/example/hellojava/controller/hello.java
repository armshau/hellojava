package com.example.hellojava.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {

  @GetMapping("/hello")
  public String helloTank(HttpServletRequest request) throws InterruptedException {
    System.out.println(request.getRemoteAddr());
    return "hello tank";
  }

}
