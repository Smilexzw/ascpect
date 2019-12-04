package com.jd.ascpect.common.enums;

/**
 * Spring 会将异常映射成为HTTP状态码
 * 状态码枚举
 * @author xuzhangwang
 * @date 2019/11/12 13:16
 */
public enum  CodeStatus {

    /** 成功 */
    SUCCESS(200, "OK"),
    FAIL(-1, "Fail"),
    /** 错误请求 */
    BAD_REQUEST(400, "Bad Request"),
    /** 资源没有找到 */
    NOT_FOUND(404, "Bad Request"),
    /** 资源没有找到 */
    METHOD_NOT_ALLOW(405, "Method Not Allow"),
    /** 服务器错误 */
    NOT_ACCEPTABLE(406, "Not Acceptable"),
    /** 服务器错误 */
    INTER_SERVER_ERROR(500, "Internal Server Error");


    /** 状态码 */
    private int code;
    /** 状态信息 */
    private String standardMessage;
    CodeStatus(int code, String standardMessage) {
        this.code = code;
        this.standardMessage = standardMessage;
    }

    public int getCode() {
        return code;
    }

    public String getStandardMessage() {
        return standardMessage;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setStandardMessage(String standardMessage) {
        this.standardMessage = standardMessage;
    }
}
