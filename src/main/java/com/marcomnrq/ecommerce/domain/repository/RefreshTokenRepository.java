package com.marcomnrq.ecommerce.domain.repository;

import com.marcomnrq.ecommerce.domain.model.RefreshToken;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Long> {
    Optional<RefreshToken> findByToken(String token);
    void deleteByToken(String token);
}
