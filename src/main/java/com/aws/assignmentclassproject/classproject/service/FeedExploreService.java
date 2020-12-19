package com.aws.assignmentclassproject.classproject.service;

import com.aws.assignmentclassproject.classproject.bean.FeedRequestBean;
import com.aws.assignmentclassproject.classproject.bean.FeedResponseBean;

public interface FeedExploreService {
    public FeedResponseBean getFeed(int userId) throws Exception;

    public FeedResponseBean addPost(FeedRequestBean feedRequestBean) throws Exception;
}
