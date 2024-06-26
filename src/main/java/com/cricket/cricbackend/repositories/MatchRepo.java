package com.cricket.cricbackend.repositories;

import com.cricket.cricbackend.entities.Match;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MatchRepo extends JpaRepository<Match, Integer> {
    Optional<Match> findByMatchHeading(String matchHeading);
}
