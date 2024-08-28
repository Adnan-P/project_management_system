package com.adnan.projectmanagementsystem.service;

import com.adnan.projectmanagementsystem.modal.PlanType;
import com.adnan.projectmanagementsystem.modal.Subscription;
import com.adnan.projectmanagementsystem.modal.User;

public interface SubscriptionService {
    Subscription createSubscription(User user);
    Subscription getUserSubscription(Long userId) throws Exception;
    Subscription upgradeSubscription(Long userId, PlanType planType);

    boolean isValid(Subscription subscription);
}
