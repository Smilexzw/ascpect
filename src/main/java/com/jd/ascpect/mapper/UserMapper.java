package com.jd.ascpect.mapper;

import com.jd.ascpect.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


/**
 * @author xuzhangwang
 * @date 2019/11/8 16:45
 */
@Mapper
public interface UserMapper  {

    List<User> findAll();

}
