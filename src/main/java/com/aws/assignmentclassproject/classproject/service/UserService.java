package com.aws.assignmentclassproject.classproject.service;

import com.aws.assignmentclassproject.classproject.bean.ResponseBean;
import com.aws.assignmentclassproject.classproject.bean.UserRequestBean;

public interface UserService {
    public ResponseBean signIn(UserRequestBean userRequestBean) throws Exception;
    public ResponseBean createUser(UserRequestBean userRequestBean) throws Exception;
}
