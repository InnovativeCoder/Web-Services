package dev.jerry.restful.JPA;

import dev.jerry.restful.User.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
