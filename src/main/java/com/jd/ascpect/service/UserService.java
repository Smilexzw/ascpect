package com.jd.ascpect.service;


import com.github.pagehelper.PageInfo;
import com.jd.ascpect.pojo.User;

import java.util.List;

/**
 * @author xuzhangwang
 * @date 2019/11/8 17:54
 */
public interface UserService {

    List<User> findAll();

    PageInfo<User> findByPage(Integer pageNum, Integer pageSize);

}
