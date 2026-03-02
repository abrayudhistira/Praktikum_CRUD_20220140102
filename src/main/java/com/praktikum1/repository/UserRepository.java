package com.praktikum1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.praktikum1.model.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    
}
