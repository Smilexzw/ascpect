package com.jd.ascpect.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author xuzhangwang
 * @date 2019/11/14 11:13
 */
@Controller
@Slf4j
public class SiteController {


    @GetMapping("/base/site/edit/{id}")
    public String edit(@PathVariable("id") Integer id, Model model) {
        try {
            if (id != null && id > 0) {
                this.setSiteValueToModel(model, id);
            }
        } catch (Exception e) {
            log.error("站点记录Id：{} 请求异常:", id, e);
        }
        return "site";
    }

    private void setSiteValueToModel(Model model, Integer id) {
        model.addAttribute("id", id);
        model.addAttribute("username", "xzw");
    }
}
