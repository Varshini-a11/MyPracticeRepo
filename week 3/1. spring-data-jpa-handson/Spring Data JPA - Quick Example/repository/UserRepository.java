package com.example.springdatajpahandson.repository;

import com.example.springdatajpahandson.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
