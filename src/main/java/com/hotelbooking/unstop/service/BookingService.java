package com.hotelbooking.unstop.service;

import com.hotelbooking.unstop.model.Room;
import com.hotelbooking.unstop.repository.RoomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
@RequiredArgsConstructor
public class BookingService {
    private final RoomRepository roomRepository; // Ensure this is final

    @Transactional
    public List<Room> bookRooms(int numberOfRooms) {
        List<Room> availableRooms = roomRepository.findByIsAvailableTrue();
        List<Room> bookedRooms = new ArrayList<>();

        if (availableRooms.size() >= numberOfRooms) {
            for (int i = 0; i < numberOfRooms; i++) {
                Room room = availableRooms.get(i);
                room.setAvailable(false);
                roomRepository.save(room);
                bookedRooms.add(room);
            }
        }

        return bookedRooms;
    }

    @Transactional
    public void resetBookings() {
        List<Room> allRooms = roomRepository.findAll();
        allRooms.forEach(room -> room.setAvailable(true));
        roomRepository.saveAll(allRooms);
    }

    @Transactional
    public void generateRandomOccupancy() {
        List<Room> allRooms = roomRepository.findAll();
        Random random = new Random();

        allRooms.forEach(room -> room.setAvailable(random.nextBoolean()));
        roomRepository.saveAll(allRooms);
    }

    public List<Room> getAvailableRooms() {
        return roomRepository.findByIsAvailableTrue();
    }
}