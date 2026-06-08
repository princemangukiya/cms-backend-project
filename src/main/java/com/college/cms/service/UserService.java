package com.college.cms.service;

import com.college.cms.entity.User;

public interface UserService {
    User registerUser(User user);
    User loginUser(String email, String password);
}