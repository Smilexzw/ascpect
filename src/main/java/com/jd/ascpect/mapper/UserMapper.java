package com.jd.ascpect.mapper;


import com.jd.ascpect.common.annotation.JMethod;
import com.jd.ascpect.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

/**
 * @author xuzhangwang
 * @date 2019/11/8 16:45
 */
@Mapper
public interface UserMapper {

    @Select("select * from t_user where id=#{id}")
    User selectOne(Integer id);

}
