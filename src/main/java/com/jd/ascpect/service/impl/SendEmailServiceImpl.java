package com.jd.ascpect.service.impl;

import com.jd.ascpect.pojo.Email;
import lombok.extern.slf4j.Slf4j;
import com.jd.ascpect.service.SendEmailService;
import org.springframework.stereotype.Service;

/**
 * @author xuzhangwang
 * @date 2019/11/7 18:17
 */
@Slf4j
@Service
public class SendEmailServiceImpl implements SendEmailService {

    @Override
    public void sendEmail() {
        String title = "xxx";
        String username = "xxx";
        String email = "xxx@xx.com";
        log.info("title: {}, username: {}, email: {}", title, username, email);
    }

    @Override
    public void sayHello(String username) {
        log.info("{} say hello", username);
    }

    @Override
    public void sendEmail(Email email) {
        log.info("title: {}, content: {}, username: {}, email: {}", email.getTitle(),
                email.getContent(), email.getUsername(), email.getEmail());
    }

}
