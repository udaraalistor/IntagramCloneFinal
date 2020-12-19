package com.aws.assignmentclassproject.classproject.model;

import javax.persistence.*;
import java.util.Objects;


@Entity
public class Post {
    private int postId;
    private String caption;
    private Integer likeCount;
    private User userId;

    @Id
    @Column(name = "post_id")
    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    @Basic
    @Column(name = "caption")
    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    @Basic
    @Column(name = "like_count")
    public Integer getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return postId == post.postId &&
                Objects.equals(caption, post.caption) &&
                Objects.equals(likeCount, post.likeCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(postId, caption, likeCount);
    }

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "userId")
    public User getUserId() {
        return userId;
    }

    public void setUserId(User userByUserId) {
        this.userId = userByUserId;
    }
}

