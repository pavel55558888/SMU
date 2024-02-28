package com.example.smu.mail.controller;

import com.example.smu.mail.config.MailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MailController {
    @Autowired
    private MailSender mailSender;

    @PostMapping("/mail-send")
    public String sendEmail(@RequestParam String name,
                            @RequestParam String tel) {
        try {
            String emailTo = "p-vikulinpbb@yandex.ru";
            String subject = "Новая заявка с сайта SMU 36";
            String message = "Вас просил перезвонить: " + name + "\n" + " На номер: " + tel;
            mailSender.send(emailTo, subject, message);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "redirect:/";
    }
}