package com.aws.assignmentclassproject.classproject.dao;

import com.aws.assignmentclassproject.classproject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    public User getUserByUserId(int userId);

}
