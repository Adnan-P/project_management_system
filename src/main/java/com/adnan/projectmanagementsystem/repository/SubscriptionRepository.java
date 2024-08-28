package com.adnan.projectmanagementsystem.repository;

import com.adnan.projectmanagementsystem.modal.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubscriptionRepository extends JpaRepository<Subscription,Long> {
    Subscription findByUserId(Long userId);
}
