package com.ineat.academy.unittests.repositories;

import com.ineat.academy.unittests.entities.ApplicationUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationUserRepository extends JpaRepository<ApplicationUser, String> {
}
