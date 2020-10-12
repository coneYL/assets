package com.cone.yang.assets.user.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Rest返回数据接口
 *
 * @author YangLei
 * @version 1.0.0.1
 * @since 2020/10/10 17:13
 */
@Setter
@Getter
public class ResultDTO<T> implements Serializable {
    private ResultStatusEnum status;
    private LocalDateTime timestamp = LocalDateTime.now();
    private String message;
    private T data;

    public static <T> ResultDTO<T> success(T data){
        ResultDTO<T> success = new ResultDTO<T>();
        success.setStatus(ResultStatusEnum.SUCCESS);
        success.setData(data);
        return success;
    }

    public static <T> ResultDTO<T> success(T data,String message){
        ResultDTO<T> success = new ResultDTO<T>();
        success.setStatus(ResultStatusEnum.SUCCESS);
        success.setData(data);
        success.setMessage(message);
        return success;
    }


    public static <T> ResultDTO<T> error(T data,String message){
        ResultDTO<T> error = new ResultDTO<T>();
        error.setStatus(ResultStatusEnum.ERROR);
        error.setData(data);
        error.setMessage(message);
        return error;
    }
}
