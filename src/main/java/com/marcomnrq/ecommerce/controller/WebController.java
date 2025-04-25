package com.marcomnrq.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

  @GetMapping({"/", "/carrito", "/ordenes", "/payment"})
  public String index() {
    return "index";
  }
}
