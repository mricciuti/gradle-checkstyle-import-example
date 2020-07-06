package org.mri.gradle.checkstyle.dao;

import java.util.Optional;

import org.mri.gradle.checkstyle.entity.User;
import org.mri.gradle.checkstyle.service.UserService;

public interface UserRepository {

    Optional<User> findById(Long id);
}
