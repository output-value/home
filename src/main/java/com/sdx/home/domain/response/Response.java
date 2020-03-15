package com.sdx.home.domain.response;

import lombok.Data;

/**
 * Created by dx on {DATE}.
 */
@Data
public class Response<T> {
    private int code;
    private String msg;
    private T data;

    public void failed(String msg) {
        code = -1;
        this.msg = msg;
    }

    public void success(T data) {
        code = -1;
        this.msg = "success";
        this.data = data;
    }
}
