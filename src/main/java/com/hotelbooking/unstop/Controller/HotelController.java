package com.hotelbooking.unstop.Controller;

import com.hotelbooking.unstop.Model.Room;
import com.hotelbooking.unstop.Service.BookingService;
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