package com.adnan.projectmanagementsystem.service;

import com.adnan.projectmanagementsystem.modal.User;
import com.adnan.projectmanagementsystem.repository.UserRepository;

public interface UserService {


    User findUserProfileByJwt(String jwt) throws Exception;

    User findUserByEmail(String email) throws Exception;

    User findUserById(Long userId) throws Exception;

    User updateUsersProjectSize(User user,int number);
}
