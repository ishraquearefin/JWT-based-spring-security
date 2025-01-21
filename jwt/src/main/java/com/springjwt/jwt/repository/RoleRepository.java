package com.springjwt.jwt.repository;

import com.springjwt.jwt.model.Role;
import com.springjwt.jwt.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role,Long> {
    Optional<Role> findByName(String name);
    Boolean existName(String name);

}
