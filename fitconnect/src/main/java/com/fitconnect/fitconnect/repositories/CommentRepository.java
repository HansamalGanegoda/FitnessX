// CommentRepository.java
package com.fitconnect.fitconnect.repositories;

import com.fitconnect.fitconnect.models.Comment;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends MongoRepository<Comment, String> {
    // Add custom query methods if needed
}
