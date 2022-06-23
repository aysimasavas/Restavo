package com.demo.restavo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.restavo.dataAccess.ReservationRepo;
import com.demo.restavo.entities.Reservation;

@Service
public class ReservationService {

	@Autowired
	ReservationRepo repo;

	public List<Reservation> findAll() {
		return repo.findAll();
	}

	public Reservation save(Reservation reservation) {
		return repo.save(reservation);
	}


}
