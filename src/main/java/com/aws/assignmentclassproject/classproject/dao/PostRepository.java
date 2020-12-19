package com.aws.assignmentclassproject.classproject.dao;

import com.aws.assignmentclassproject.classproject.model.Post;
import com.aws.assignmentclassproject.classproject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Integer> {

    public List<Post> getAllPostByUserIdIsNotIn(List<User> userIds);

}
