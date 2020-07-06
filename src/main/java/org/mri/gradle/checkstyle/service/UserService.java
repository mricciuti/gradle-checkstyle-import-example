package org.mri.gradle.checkstyle.service;

import java.util.Optional;

import org.mri.gradle.checkstyle.dao.UserRepository;
import org.mri.gradle.checkstyle.entity.User;

public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<User> findUserById(Long id) {
        return userRepository.findById(id);
    }
}
