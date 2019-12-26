package com.jd.ascpect.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jd.ascpect.common.annotation.JMethod;
import com.jd.ascpect.mapper.UserMapper;
import com.jd.ascpect.pojo.User;
import com.jd.ascpect.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author xuzhangwang
 * @date 2019/11/8 17:55
 */
@Service
@Slf4j
public class UserServiceImpl implements  UserService {

    @Resource
    UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public PageInfo<User> findByPage(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<User> list = userMapper.findAll();
        PageInfo page = new PageInfo(list);
        return page;
    }

//    @JMethod(module = "用户管理", remark = "根据用户ID查询信息", operateType = "SELECT")

}
