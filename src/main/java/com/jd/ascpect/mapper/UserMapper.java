package com.jd.ascpect.mapper;


import com.jd.ascpect.common.annotation.JMethod;
import com.jd.ascpect.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author xuzhangwang
 * @date 2019/11/8 16:45
 */
@Mapper
public interface UserMapper {

    @JMethod(module = "用户管理", remark = "根据用户ID查询信息", operateType = "SELECT")
    @Select("select * from t_user where id=#{id}")
    User selectOne(Integer id);

}
