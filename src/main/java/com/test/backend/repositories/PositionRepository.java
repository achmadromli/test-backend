package com.test.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.backend.entities.Position;

public interface PositionRepository extends JpaRepository<Position, Long> {

}
