package com.jd.ascpect.service.impl;

import com.jd.ascpect.common.annotation.JMethod;
import com.jd.ascpect.mapper.UserMapper;
import com.jd.ascpect.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xuzhangwang
 * @date 2019/11/8 17:55
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

//    @JMethod(module = "用户管理", remark = "根据用户ID查询信息", operateType = "SELECT")

}
