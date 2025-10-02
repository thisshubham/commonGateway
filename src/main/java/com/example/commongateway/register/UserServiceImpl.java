package com.example.commongateway.register;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepo userRepo;
    @Override
    public void save(User user) {
        try {
            userRepo.save(user);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
