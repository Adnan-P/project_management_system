package com.adnan.projectmanagementsystem.repository;

import com.adnan.projectmanagementsystem.modal.Chat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatRepository extends JpaRepository<Chat,Long> {

}
