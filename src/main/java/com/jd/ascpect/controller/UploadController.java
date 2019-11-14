package com.jd.ascpect.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author xuzhangwang
 * @date 2019/11/12 10:34
 */
@Controller
@RequestMapping("/upload")
public class UploadController {


    @GetMapping("/page")
    public String uploadPage() {
        return "upload";
    }




}
