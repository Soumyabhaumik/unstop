package com.hotelbooking.unstop.Service;

import com.hotelbooking.unstop.Model.Room;
import com.hotelbooking.unstop.Repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookingService {

    @Autowired
    private RoomRepository roomRepository;

    public List<Room> bookRooms(int numberOfRooms) {
        List<Room> availableRooms = roomRepository.findByIsAvailableTrue();
        List<Room> bookedRooms = new ArrayList<>();

        // Booking logic based on the rules provided
        // 1. Try to book rooms on the same floor first
        // 2. If not enough rooms are available, try to minimize travel time

        // Implement your booking logic here...

        // Mark rooms as booked
//        for (Room room : bookedRooms) {
//            room.setAvailable(false);
//            roomRepository.save(room);
//        }

        return bookedRooms;
    }

    public void resetBookings() {
        List<Room> allRooms = roomRepository.findAll();
        for (Room room : allRooms) {
            room.getAvailable(true);
        }
        roomRepository.saveAll(allRooms);
    }
    public void generateRandomOccupancy() {

        // Implement random occupancy logic

    }

}