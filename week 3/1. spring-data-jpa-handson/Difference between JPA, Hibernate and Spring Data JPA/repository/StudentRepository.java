package com.example.springdatajpahandson.repository;

import com.example.springdatajpahandson.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
