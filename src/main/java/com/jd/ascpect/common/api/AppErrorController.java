package com.jd.ascpect.common.api;

import org.springframework.boot.autoconfigure.web.ErrorAttributes;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 处理springboot的错误页面显示问题
 * web页面全局配置
 * @author xuzhangwang
 * @date 2019/11/12 14:36
 */
@Controller
public class AppErrorController implements ErrorController {

    /** springboot 发现错误会统一返回到error*/
    private static final String ERROR_PATH = "/error";

    private ErrorAttributes errorAttributes;

    @Override
    public String getErrorPath() {
        return ERROR_PATH;
    }

    public AppErrorController(ErrorAttributes errorAttributes) {
        this.errorAttributes = errorAttributes;
    }

    @RequestMapping(value = ERROR_PATH, produces = "text/html")
    public String errorHandler(HttpServletRequest request, HttpServletResponse response) {
        int code = response.getStatus();
        switch (code) {
            case 403:
                return "403";
            case 404:
                return "404";
            case 500:
                return "500";
            default:
                return "index";
        }
    }


}
