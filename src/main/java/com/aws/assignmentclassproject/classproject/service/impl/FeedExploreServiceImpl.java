package com.aws.assignmentclassproject.classproject.service.impl;

import com.aws.assignmentclassproject.classproject.bean.FeedDTO;
import com.aws.assignmentclassproject.classproject.bean.FeedRequestBean;
import com.aws.assignmentclassproject.classproject.bean.FeedResponseBean;
import com.aws.assignmentclassproject.classproject.dao.PostRepository;
import com.aws.assignmentclassproject.classproject.dao.UserRepository;
import com.aws.assignmentclassproject.classproject.model.Post;
import com.aws.assignmentclassproject.classproject.model.User;
import com.aws.assignmentclassproject.classproject.service.FeedExploreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FeedExploreServiceImpl implements FeedExploreService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PostRepository postRepository;

    @Override
    public FeedResponseBean getFeed(int userId) throws Exception {
        FeedResponseBean feedResponseBean = new FeedResponseBean();
        List<User> userIds = new ArrayList<>();

        User user = new User();
        user.setUserId(userId);
        userIds.add(user);

        List<Post> postList = postRepository.getAllPostByUserIdIsNotIn(userIds);
        List<FeedDTO> data = new ArrayList<>();

        for (Post post : postList) {
            FeedDTO feedDTO = new FeedDTO();

            feedDTO.setPostId(post.getPostId());
            feedDTO.setText(post.getCaption());
            feedDTO.setLikeCount(post.getLikeCount());

            data.add(feedDTO);
        }

        feedResponseBean.setData(data);
        return feedResponseBean;
    }

    @Override
    public FeedResponseBean addPost(FeedRequestBean feedRequestBean) throws Exception {


        FeedDTO postDTO = feedRequestBean.getPost();

        User user = userRepository.getUserByUserId(feedRequestBean.getUserId());

        Post post = new Post();
        post.setCaption(postDTO.getText());
        post.setLikeCount(0);
        post.setCaption(postDTO.getText());


        return null;
    }
}
