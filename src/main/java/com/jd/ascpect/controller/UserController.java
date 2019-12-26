package com.jd.ascpect.controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.jd.ascpect.common.api.ApiResponse;
import com.jd.ascpect.pojo.User;
import com.jd.ascpect.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author xuzhangwang
 * @date 2019/12/8 22:12
 */
@Controller
@Slf4j
public class UserController {

    @Autowired
    UserService userService;


    @GetMapping("/get/user")
    @ResponseBody
    public PageInfo<User> findByPage(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum, @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize) {
        PageInfo<User> pageInfo = userService.findByPage(pageNum, pageSize);
        log.info("分页信息: {}", JSON.toJSONString(pageInfo));
        return pageInfo;
    }

    @GetMapping("/get/all/user")
    @ResponseBody
    public ApiResponse findAllUser() {
        List<User> userList = this.userService.findAll();
        return ApiResponse.ofSuccess(userList);
    }

}
