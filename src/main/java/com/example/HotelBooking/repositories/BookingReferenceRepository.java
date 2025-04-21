package com.example.HotelBooking.repositories;

import com.example.HotelBooking.entities.BookingReference;
import com.example.HotelBooking.entities.PaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookingReferenceRepository extends JpaRepository<BookingReference,Long> {


    Optional<BookingReference> findByReferenceNo(String referenceNo);
}
