package com.ineat.academy.unittests.services;

import com.ineat.academy.unittests.entities.ApplicationUser;
import com.ineat.academy.unittests.repositories.ApplicationUserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final ApplicationUserRepository userRepository;

    public UserService(ApplicationUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String getFullName(String userId) {
        final ApplicationUser user = userRepository.findById(userId).get();
        return user.firstName + user.lastName.toUpperCase();
    }
}
