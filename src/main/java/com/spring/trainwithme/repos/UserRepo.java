package com.spring.trainwithme.repos;

import com.spring.trainwithme.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String Username);
    User findByEmail(String Email);
}
