package com.jd.ascpect.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Map;

/**
 * @author xuzhangwang
 * @date 2019/11/8 15:14
 */
@Controller
public class IndexController {

    @GetMapping("/get/aaa/{username}")
    public String index(@PathVariable("username") String username, Model model) {
        model.addAttribute("username", username);
        return "index";
    }
}
