package com.hotelbooking.unstop.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String roomNumber;
    private boolean Available = true;
    private int floorNumber;


}
