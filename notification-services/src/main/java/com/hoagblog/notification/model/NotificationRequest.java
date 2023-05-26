package com.hoagblog.notification.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NotificationRequest {
    private String title;
    private String message;
    private String topic;
    private String token;
}