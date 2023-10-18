package dev.jerry.restful.JPA;

import dev.jerry.restful.User.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {
}
