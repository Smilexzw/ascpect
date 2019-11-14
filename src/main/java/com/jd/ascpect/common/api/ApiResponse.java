package com.jd.ascpect.common.api;

import com.jd.ascpect.common.enums.CodeStatus;
import lombok.Getter;
import lombok.Setter;

/**
 * Api格式封装
 * 创建统一返回json格式
 * @author xuzhangwang
 * @date 2019/11/12 13:12
 */
@Getter
@Setter
public class ApiResponse {

    private Integer code;
    private String message;
    private Object data;
    private boolean more;

    public ApiResponse() {
        this.code = CodeStatus.SUCCESS.getCode();
        this.message = CodeStatus.SUCCESS.getStandardMessage();
    }

    public ApiResponse(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    /* 常用的一些公用的方法*/
    public static ApiResponse ofMessage(int code, String message) {
        return new ApiResponse(code, message, null);
    }

    public static ApiResponse ofSuccess(Object data) {
        return new ApiResponse(CodeStatus.SUCCESS.getCode(), CodeStatus.SUCCESS.getStandardMessage(), data);
    }

    public static ApiResponse ofStatus(CodeStatus status) {
        return new ApiResponse(status.getCode(), status.getStandardMessage(), null);
    }
}
