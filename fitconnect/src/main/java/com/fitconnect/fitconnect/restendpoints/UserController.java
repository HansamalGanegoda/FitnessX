package com.fitconnect.fitconnect.restendpoints;

import com.fitconnect.fitconnect.models.User;
import com.fitconnect.fitconnect.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{username}")
    public ResponseEntity<User> getUserByUsername(@PathVariable("username") String username) {
        User user = userService.getUserByUsername(username);
        if (user != null) {
            return ResponseEntity.ok(user);
        } 
            // Check this line
        return null;
        }
    }

