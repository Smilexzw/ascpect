package com.jd.ascpect.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jd.ascpect.pojo.User;
import org.apache.ibatis.annotations.Mapper;


/**
 * @author xuzhangwang
 * @date 2019/11/8 16:45
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
