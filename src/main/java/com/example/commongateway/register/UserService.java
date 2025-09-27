package com.example.commongateway.register;

import org.springframework.stereotype.Service;

@Service
public interface UserService  {
    void save(User user);
}
