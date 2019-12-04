package com.jd.ascpect.mapper;

import com.jd.ascpect.pojo.TModel;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author xuzhangwang
 * @date 2019/11/26 16:37
 */
@Mapper
public interface TModelMapper {

    List<TModel> selectAllTModel();

    @Delete("delete from t_model where id=#{id}")
    int deleteById(Integer id);

}
