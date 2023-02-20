package com.nivaldo.beirao.repository;

import com.nivaldo.beirao.model.JourneyWork;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JourneyRepository extends JpaRepository<JourneyWork, Long> {
}
