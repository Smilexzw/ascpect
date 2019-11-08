package com.jd.ascpect.service;

import com.jd.ascpect.pojo.Email;

/**
 * @author xuzhangwang
 * @date 2019/11/7 18:16
 */
public interface SendEmailService {

    /**
     * 模拟发送邮件
     */
    void sendEmail();

    void sayHello(String username);

    /**
     * 模拟发送邮件
     * @param email
     */
    void sendEmail(Email email);

}
