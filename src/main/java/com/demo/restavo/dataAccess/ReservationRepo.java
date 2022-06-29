package com.demo.restavo.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.restavo.entities.Reservation;

@Repository
public interface ReservationRepo extends JpaRepository<Reservation, Long> {

}
