package com.marcomnrq.ecommerce.domain.repository;

import com.marcomnrq.ecommerce.domain.model.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
