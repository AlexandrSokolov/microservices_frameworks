package com.savdev.sb.packaging.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestWebController {

  @RequestMapping("/")
  String get() {
    return "Test Get";
  }
}
