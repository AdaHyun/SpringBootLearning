package com.ada.mybatisplus.demo3.exception;

public final class ServiceException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    private Integer code;

    private String message;

    private String detailMessage;


    public ServiceException(){

    }

    public ServiceException(String message){
        this.message = message;
    }

    public ServiceException(String message,Integer code){
        this.message = message;
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public String getDetailMessage() {
        return detailMessage;
    }

    public ServiceException setMessage(String message) {
        this.message = message;
        return this;
    }

    public ServiceException setDetailMessage(String detailMessage) {
        this.detailMessage = detailMessage;
        return this;
    }

}
