package org.mri.gradle.checkstyle.web;

import org.mri.gradle.checkstyle.dao.UserRepository;
import org.mri.gradle.checkstyle.dao.ext.UserExtRepository;
import org.mri.gradle.checkstyle.service.UserService;

public class UserController {

    private final UserService userService;
    private final UserRepository userRepository;
    private UserExtRepository  userExtRepository;

    public UserController(UserService userService, UserRepository userRepository) {
        this.userService = userService;
        this.userRepository = userRepository;
    }

}
