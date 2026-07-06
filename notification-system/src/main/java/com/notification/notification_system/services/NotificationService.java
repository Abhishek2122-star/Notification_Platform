package com.notification.notification_system.services;

import com.notification.notification_system.entity.Notification;
import com.notification.notification_system.repository.NotificationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class NotificationService {

    private final NotificationRepository notificationRepository;

    public String sendNotification(String email, String message) {
        Notification notification = new Notification();
        notification.setEmail(email);
        notification.setMessage(message);
        notification.setCreatedAt(new Date());

        notificationRepository.save(notification); // 🔥 THIS IS IMPORTANT

        return "Notification Sent!";
    }

    public List<Notification> getUserNotifications(String email) {
        return notificationRepository.findByEmail(email);
    }
}