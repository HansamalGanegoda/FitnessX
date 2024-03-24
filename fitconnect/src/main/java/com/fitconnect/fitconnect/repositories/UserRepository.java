// UserRepository.java
package com.fitconnect.fitconnect.repositories;

import org.springframework.stereotype.Repository;

import com.fitconnect.fitconnect.models.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    User findByUsername(String username);
}
