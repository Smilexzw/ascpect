package com.jd.ascpect.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jd.ascpect.common.api.ApiResponse;
import com.jd.ascpect.common.enums.CodeStatus;
import com.jd.ascpect.mapper.TModelMapper;
import com.jd.ascpect.pojo.TModel;
import com.jd.ascpect.service.TModelService;
import org.aspectj.apache.bcel.classfile.Code;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xuzhangwang
 * @date 2019/11/26 16:42
 */
@Service
public class TModelServiceImpl implements TModelService {

    @Autowired
    TModelMapper modelMapper;

    @Override
    public PageInfo<TModel> selectTModelByPageQuery(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<TModel> models = modelMapper.selectAllTModel();
        PageInfo pageInfo =new PageInfo(models);
        return pageInfo;
    }

    @Override
    public ApiResponse deleteById(Integer id) {
        int result = modelMapper.deleteById(id);
        if (result == 0) {
            return ApiResponse.ofMessage(-1, "删除失败, 记录不存在");
        }
        return ApiResponse.ofStatus(CodeStatus.SUCCESS);
    }
}
