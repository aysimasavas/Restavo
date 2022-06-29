package com.demo.restavo.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.restavo.entities.Reservation;
import com.demo.restavo.service.ReservationService;



@CrossOrigin
@RestController
@RequestMapping("/reservation")
public class ReservationController {
	
	@Autowired
	ReservationService reservationService; 
	
	@GetMapping("/allReservations")
	public ResponseEntity<List<Reservation>> getAll() {
		List<Reservation> reservations = reservationService.findAll();
		return ResponseEntity.ok(reservations);
	}

	@PostMapping("/create")
	public ResponseEntity<Reservation> createReservation(@RequestBody Reservation reservation){
		
		reservationService.save(reservation);
		return ResponseEntity.ok(reservation);
		
	}

}
