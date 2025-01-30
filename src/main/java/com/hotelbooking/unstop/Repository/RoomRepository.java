package com.hotelbooking.unstop.Repository;

import com.hotelbooking.unstop.Model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoomRepository extends JpaRepository<Room,String> {
    List<Room> findByIsAvailableTrue();

}
