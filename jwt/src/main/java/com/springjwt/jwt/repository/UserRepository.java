package com.springjwt.jwt.repository;

import com.springjwt.jwt.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity,Long> {
    Optional<UserEntity> findByUserName(String username);
    Boolean existUserName(String username);
}
