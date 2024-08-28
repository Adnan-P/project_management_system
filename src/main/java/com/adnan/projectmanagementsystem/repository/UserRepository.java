package com.adnan.projectmanagementsystem.repository;

import com.adnan.projectmanagementsystem.modal.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByEmail(String email);
}
