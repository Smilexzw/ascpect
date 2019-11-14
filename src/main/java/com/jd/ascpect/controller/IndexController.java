package com.jd.ascpect.controller;

import com.jd.ascpect.common.api.ApiResponse;
import com.jd.ascpect.common.enums.CodeStatus;
import com.jd.ascpect.pojo.User;
import com.jd.ascpect.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.Map;

/**
 * @author xuzhangwang
 * @date 2019/11/8 15:14
 */
@Controller
public class IndexController {

    @Autowired
    UserService userService;


    @GetMapping("/get/aaa/{username}")
    public String index(@PathVariable("username") String username, Model model) {
        model.addAttribute("username", username);
        return "index";
    }

    @GetMapping("/get/user/{id}")
    @ResponseBody
    public ApiResponse selectUserById(@PathVariable("id") Integer id) {
        User user = userService.selectOne(id);
        if (null == user) {
            return ApiResponse.ofStatus(CodeStatus.BAD_REQUEST);
        }
        return ApiResponse.ofSuccess(user);
    }

}
