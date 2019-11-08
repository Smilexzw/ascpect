package com.jd.ascpect.pojo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author xuzhangwang
 * @date 2019/11/8 17:03
 */
@Setter
@Getter
public class User implements Serializable {

    private Integer id;

    private String username;

    private String password;

    private String email;

    private String phone;

    private Integer gender;
}
