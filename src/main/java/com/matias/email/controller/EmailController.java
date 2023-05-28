package com.matias.email.controller;

import com.matias.email.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/email")
public class EmailController {

  @Autowired
  private EmailService emailService;

  @GetMapping
  public void prueba() {
    emailService.sendMessage("addressee@outlook.com", "Title", "Message");
  }

}
