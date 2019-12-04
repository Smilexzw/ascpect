package com.jd.ascpect.controller;

import com.github.pagehelper.PageInfo;
import com.jd.ascpect.common.api.ApiResponse;
import com.jd.ascpect.pojo.TModel;
import com.jd.ascpect.service.TModelService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author xuzhangwang
 * @date 2019/11/26 16:47
 */
@Controller
@Slf4j
public class TModelController {

    @Autowired
    TModelService modelService;

    @GetMapping("/get/model")
    @ResponseBody
    public PageInfo<TModel> getTModelByQuery(Integer pageNum, Integer pageSize) {
        log.info("查询页数: {}, 查询大小: {}", pageNum, pageNum);
        return modelService.selectTModelByPageQuery(pageNum, pageSize);
    }

    @GetMapping("/delete/model/{id}")
    @ResponseBody
    public ApiResponse deleteById(@PathVariable("id") Integer id) {

        ApiResponse apiResponse = modelService.deleteById(id);
        return apiResponse;
    }

}
