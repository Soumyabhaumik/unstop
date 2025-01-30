package com.hotelbooking.unstop.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "rooms")
@NoArgsConstructor
@AllArgsConstructor
public class Room {
    @Id
    @Column(name = "room_number")
    private String roomNumber;

    @Column(name = "is_available")
    private boolean isAvailable = true;

    @Column(name = "floor_number")
    private int floorNumber;

    // Explicit getter for isAvailable
    public boolean isAvailable() {
        return this.isAvailable;
    }

    // Explicit setter for isAvailable
    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }
}