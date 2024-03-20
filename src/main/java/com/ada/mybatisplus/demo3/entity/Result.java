package com.ada.mybatisplus.demo3.entity;

import org.springframework.http.HttpStatus;
import org.springframework.util.StringUtils;

import java.util.HashMap;

public class Result extends HashMap<String, Object> {

    public static final String CODE_TAG = "code";

    public static final String MSG_TAG = "msg";

    /** 数据对象 */
    public static final String DATA_TAG = "data";

    /**
     * 初始化一个新创建的 Result 对象，使其表示一个空消息。
     */
    public Result()
    {
    }


    public Result(int code,String msg){
        super.put(CODE_TAG,code);
        super.put(MSG_TAG,msg);
    }

    public Result(int code,String msg,Object data){
        super.put(CODE_TAG,code);
        super.put(MSG_TAG,msg);
        if (!StringUtils.isEmpty(data)) {
            super.put(DATA_TAG,data);
        }
    }

    public static Result success(){
        return Result.success("操作成功");
    }

    public static Result success(Object data){
        return Result.success("操作成功",data);
    }

    public static Result success(String msg){
        return Result.success(msg,null);
    }

    public static Result success(String msg,Object data){
        return new Result(HttpStatus.OK.value(),msg,data);
    }

    //error
    public static Result error(){
        return Result.error("操作失败");
    }

    public static Result error(String msg){
        return Result.error("操作失败",null);
    }

    public static Result error(String msg,Object data){
        return new Result(HttpStatus.INTERNAL_SERVER_ERROR.value(),msg,data);
    }

    public static Result error(int code,String msg){
        return new Result(code,msg,null);
    }








}
