package com.jd.ascpect.mapper;

import com.alibaba.fastjson.JSON;
import com.jd.ascpect.ApplicationTests;
import com.jd.ascpect.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * @author xuzhangwang
 * @date 2019/11/8 17:08
 */
@Slf4j
public class UserMapperTest extends ApplicationTests {

    @Autowired
    UserMapper userMapper;

    @Test
    public void selectOne() {
        User user = userMapper.selectOne(1);
        log.info("result: " + JSON.toJSONString(user));
    }
}