package com.example.cs425eregistrar.repository;

import com.example.cs425eregistrar.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {
}
