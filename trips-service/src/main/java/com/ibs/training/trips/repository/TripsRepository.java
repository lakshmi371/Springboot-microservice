package com.ibs.training.trips.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibs.training.trips.entity.Trips;

public interface TripsRepository extends JpaRepository<Trips, Long>  {

	Trips findTripsById(Long id);



}
