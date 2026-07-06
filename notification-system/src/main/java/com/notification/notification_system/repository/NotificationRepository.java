package com.notification.notification_system.repository;

import com.notification.notification_system.entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NotificationRepository extends JpaRepository<Notification, Long> {

    List<Notification> findByEmailOrderByCreatedAtDesc(String email);

    List<Notification> findByEmailAndIsReadFalse(String email);
}