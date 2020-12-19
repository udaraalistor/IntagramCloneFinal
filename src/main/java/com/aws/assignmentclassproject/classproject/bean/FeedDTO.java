package com.aws.assignmentclassproject.classproject.bean;


import lombok.Data;

import java.util.List;

@Data
public class FeedDTO {
    int postId;
    String text;
    List<Object> images;
    List<Object> videos;
    int likeCount;
}

