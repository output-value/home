package com.sdx.home.domain.response;

import lombok.Data;

/**
 * Created by dx on {DATE}.
 */
@Data
public class Response<T> {

    private int code = 0;
    private String msg;
    private T data;

    public void failed(String msg) {
        code = -1;
        this.msg = msg;
    }

    public void failed(int code, T data) {
        this.code = code;
        this.data = data;
    }

    public void success(T data) {
        this.code = 1;
        this.msg = "success";
        this.data = data;
    }
    public void success() {
        this.code = 0;
        this.msg = "success";
    }
    public void success(String msg) {
        this.code = 0;
        this.msg = msg;
    }
}
