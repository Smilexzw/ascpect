package com.jd.ascpect.mapper;

import com.jd.ascpect.ApplicationTests;
import com.jd.ascpect.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


/**
 * @author xuzhangwang
 * @date 2019/11/8 17:08
 */
@Slf4j
public class UserMapperTest extends ApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelect() {
        List<User> userList = userMapper.selectList(null);
        Assert.assertEquals(5, userList.size());
        userList.forEach(System.out::println);
    }

}