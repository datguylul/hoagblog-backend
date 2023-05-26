package com.hoagblog.notification.controller;
import com.hoagblog.notification.model.NotificationRequest;
import com.hoagblog.notification.model.NotificationResponse;
import com.hoagblog.notification.service.NotificationService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/notification")
@AllArgsConstructor
public class NotificationController {
    private NotificationService pushNotificationService;

    @PostMapping("/token")
    public ResponseEntity sendTokenNotification(@RequestBody NotificationRequest request) {
        pushNotificationService.sendPushNotificationToToken(request);
        System.out.println("princr");
        return new ResponseEntity<>(new NotificationResponse(HttpStatus.OK.value(), "Notification has been sent."), HttpStatus.OK);
    }

}