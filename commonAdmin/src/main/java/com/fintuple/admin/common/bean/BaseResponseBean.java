package com.fintuple.admin.common.bean;

import lombok.Data;

@Data
public class BaseResponseBean<T> {
    private boolean success = true;
    private T data;
    private String message;
}