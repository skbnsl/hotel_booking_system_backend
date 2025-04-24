package com.example.HotelBooking.services;

import com.example.HotelBooking.dtos.NotificationDTO;

public interface NotificationService {

    void sendEmail(NotificationDTO notificationDTO);

    //In-Future
    void sendSms();
    void sendWhatsapp();

}