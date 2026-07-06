package com.notification.notification_system.controller;

import com.notification.notification_system.dto.NotificationRequest;
import com.notification.notification_system.entity.Notification;
import com.notification.notification_system.services.NotificationService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notifications")
@RequiredArgsConstructor
public class NotificationController {

    private final NotificationService notificationService;

    // ✅ Send notification (JSON)
    @PostMapping("/send")
    public String sendNotification(@Valid @RequestBody NotificationRequest request) {
        return notificationService.sendNotification(
                request.getEmail().trim(),
                request.getMessage().trim()
        );
    }

    // ✅ Get notifications (WORKING VERSION FOR NOW)
    @GetMapping("/my")
    public List<Notification> getMyNotifications(@RequestParam String email) {
        return notificationService.getUserNotifications(email.trim());
    }
}