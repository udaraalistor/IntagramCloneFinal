package com.aws.assignmentclassproject.classproject.controller;

import com.aws.assignmentclassproject.classproject.bean.FeedRequestBean;
import com.aws.assignmentclassproject.classproject.bean.FeedResponseBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


    @RestController
    @RequestMapping("/feed")
    public class ExploreFeedController {
        @GetMapping("/others")
        public ResponseEntity<FeedResponseBean> viewFeed(@RequestBody FeedRequestBean feedRequestBean){
            FeedResponseBean feedResponseBean = new FeedResponseBean();


            return new ResponseEntity<>(feedResponseBean, HttpStatus.OK);
        }
    }
