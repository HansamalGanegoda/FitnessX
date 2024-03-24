// UserService.java
package com.fitconnect.fitconnect.service;

import com.fitconnect.fitconnect.models.User;
import com.fitconnect.fitconnect.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

    public User getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
