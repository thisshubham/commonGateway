package com.example.commongateway.utils;

import com.example.commongateway.register.User;
import com.example.commongateway.register.UserRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Objects;

@Configuration
public class DataSeeder {

    @Bean
    CommandLineRunner initDatabase(UserRepo userRepository) {
        return args -> {
            if (Objects.isNull(userRepository.findUserByUsername("admin"))) {
                User user = new User();
                user.setUsername("admin");
                user.setFirstName("System");
                user.setLastName("Admin");
                user.setPassword(getPassEncodor().encode("admin"));
                user.setEmail("admin@example.com");
                user.setAddress("Head Office");
                user.setStatus("Active");
                userRepository.save(user);
                System.out.println("✅ Default admin user created!");
            }
        };
    }
    public PasswordEncoder getPassEncodor() {
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();

    }
}

