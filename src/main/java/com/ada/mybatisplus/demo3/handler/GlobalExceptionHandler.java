package com.ada.mybatisplus.demo3.handler;

import com.ada.mybatisplus.demo3.entity.Result;
import com.ada.mybatisplus.demo3.exception.ServiceException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler{

    @ExceptionHandler(ServiceException.class)
    public Result handleServiceExeption(ServiceException e){

        String msg = e.getMessage();
        return Result.error(e.getCode() == null?500:e.getCode(),msg);
    }
}
