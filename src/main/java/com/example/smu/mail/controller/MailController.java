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
    public String sendEmail(@RequestParam String tel,
                            @RequestParam String text) {
        try {
            String emailTo = "smy_36@mail.ru";
            String subject = "Новая заявка с сайта SMU 36";
            String message = "Номер клиента: \n" + tel + "\n\n\n" + "Сообщение клиента: \n" + text;
            mailSender.send(emailTo, subject, message);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "redirect:/";
    }
}