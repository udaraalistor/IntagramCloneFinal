package com.aws.assignmentclassproject.classproject.bean;

import lombok.Data;

import java.util.List;

@Data
public class ResponseBean {
    int responseCode;
    String errorMsg;
    List<Object> data;
}
