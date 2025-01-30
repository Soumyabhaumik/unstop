package com.hotelbooking.unstop.repository;

import com.hotelbooking.unstop.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomRepository extends JpaRepository<Room, String> {
    // Find rooms that are currently available
    List<Room> findByIsAvailableTrue();

    // Find available rooms by floor
    List<Room> findByFloorNumberAndIsAvailableTrue(int floorNumber);
}