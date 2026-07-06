package com.notification.notification_system.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data // ✅ THIS WILL AUTO-GENERATE GETTERS & SETTERS
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String message;

    private String email;

    private Date createdAt;
}