// PostRepository.java
package com.fitconnect.fitconnect.repositories;

import com.fitconnect.fitconnect.models.Post;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
    // Add custom query methods if needed
}
