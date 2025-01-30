package com.hotelbooking.unstop.controller;

import com.hotelbooking.unstop.model.Room;
import com.hotelbooking.unstop.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hotel")
public class HotelController {

    @Autowired
    private BookingService bookingService;

    @PostMapping("/book")
    public List<Room> bookRooms(@RequestParam int numberOfRooms) {
        return bookingService.bookRooms(numberOfRooms);
    }

    @PostMapping("/reset")
    public void resetBookings() {
        bookingService.resetBookings();
    }

//    @PostMapping("/generate")
//    public void generateRandomOccupancy() {
//        bookingService.generateRandomOccupancy();
//    }

//    @GetMapping("/available")
//    public List<Room> getAvailableRooms() {
//        return bookingService.getAvailableRooms();
//    }
}