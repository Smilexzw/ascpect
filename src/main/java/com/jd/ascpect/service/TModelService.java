package com.jd.ascpect.service;

import com.github.pagehelper.PageInfo;
import com.jd.ascpect.common.api.ApiResponse;
import com.jd.ascpect.pojo.TModel;

/**
 * @author xuzhangwang
 * @date 2019/11/26 16:39
 */
public interface TModelService {

    PageInfo<TModel> selectTModelByPageQuery(Integer pageNum, Integer pageSize);

    ApiResponse deleteById(Integer id);

}
