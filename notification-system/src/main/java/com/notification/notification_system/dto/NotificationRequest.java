package com.notification.notification_system.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class NotificationRequest {

    @Email
    @NotBlank
    private String email;

    @NotBlank
    private String message;
}