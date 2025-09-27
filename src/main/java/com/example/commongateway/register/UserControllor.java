package com.example.commongateway.register;

import com.example.commongateway.constant.UrlConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping(UrlConstant.BASE_URL + UrlConstant.USER_URL)
public class UserControllor {
    @Autowired
    private UserServiceImpl userService;

    @PostMapping(UrlConstant.RAGISTER_URL)
    public ResponseEntity<?> save(@RequestBody User user) {
        Map<String, Object> response = new HashMap<>();
        try {
            response.put("responseMessege", "Success");
            userService.save(user);
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception e) {
            response.put("responseMessege", "Failure");
            userService.save(user);
            return new ResponseEntity<>(response, HttpStatus.EXPECTATION_FAILED);
        }

    }
}
