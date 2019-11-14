package com.jd.ascpect.common.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author xuzhangwang
 * @date 2019/11/12 14:18
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Web Not Found")
public class WebNotFoundException extends RuntimeException {

}
