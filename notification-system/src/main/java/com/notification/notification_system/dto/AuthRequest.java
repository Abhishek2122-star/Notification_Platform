package com.notification.notification_system.dto;

import lombok.Data;

@Data
public class AuthRequest {
    private String email;
    private String password;
}