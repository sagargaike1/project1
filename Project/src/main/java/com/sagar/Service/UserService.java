package com.sagar.Service;

import com.sagar.Model.User;

public interface UserService {
    User createUser(User user);
    User getUserById(Long userId);
}