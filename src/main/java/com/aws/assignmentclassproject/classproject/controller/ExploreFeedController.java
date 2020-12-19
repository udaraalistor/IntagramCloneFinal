package com.aws.assignmentclassproject.classproject.controller;

import com.aws.assignmentclassproject.classproject.bean.FeedRequestBean;
import com.aws.assignmentclassproject.classproject.bean.FeedResponseBean;
import com.aws.assignmentclassproject.classproject.service.FeedExploreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/feed")
public class ExploreFeedController {

    @Autowired
    private FeedExploreService feedExploreService;

    @GetMapping("/others/{userId}")
    public ResponseEntity<FeedResponseBean> viewFeed(@PathVariable("userId") int userId) {
        FeedResponseBean feedResponseBean = new FeedResponseBean();

        try {
            feedResponseBean = feedExploreService.getFeed(userId);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return new ResponseEntity<>(feedResponseBean, HttpStatus.OK);
    }


    @PostMapping("/post")
    public ResponseEntity<FeedResponseBean> addPost(@RequestBody FeedRequestBean feedRequestBean) {
        FeedResponseBean feedResponseBean = new FeedResponseBean();

        try {
            feedResponseBean = feedExploreService.addPost(feedRequestBean);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return new ResponseEntity<>(feedResponseBean, HttpStatus.OK);
    }

}