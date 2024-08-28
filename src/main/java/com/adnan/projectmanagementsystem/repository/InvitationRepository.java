package com.adnan.projectmanagementsystem.repository;

import com.adnan.projectmanagementsystem.modal.Invitation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvitationRepository extends JpaRepository<Invitation,Long> {
    Invitation findByToken(String token);

    Invitation findByEmail(String userEmail);
}
