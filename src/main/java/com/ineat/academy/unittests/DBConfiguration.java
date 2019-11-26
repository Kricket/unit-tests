package com.ineat.academy.unittests;

import com.ineat.academy.unittests.repositories.ApplicationUserRepository;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackageClasses = ApplicationUserRepository.class)
public class DBConfiguration {
}
