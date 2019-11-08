package com.jd.ascpect.service;

import com.jd.ascpect.ApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * @author xuzhangwang
 * @date 2019/11/8 17:56
 */
public class UserServiceTest extends ApplicationTests {

    @Autowired
    UserService userService;

    @Test
    public void selectOne() {
        userService.selectOne(1000);
    }
}