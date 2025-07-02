package com.mobileApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mobileApp.models.WorkoutEntry;

public interface WorkoutRepository extends JpaRepository<WorkoutEntry, Long> {}
