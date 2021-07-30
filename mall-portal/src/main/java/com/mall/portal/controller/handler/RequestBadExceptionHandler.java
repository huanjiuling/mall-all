package com.mall.portal.controller.handler;

import com.mall.common.api.CommonResult;
import com.mall.common.exception.BusinessException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class RequestBadExceptionHandler {

    /**
     * 兜底异常捕捉
     */
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public CommonResult<String> ExepitonHandler(Exception e){
        if(e instanceof BusinessException){
            BusinessException businessException = (BusinessException)e;
        }
        return CommonResult.failed("请求错误:->"+e.getMessage());
    }

}
