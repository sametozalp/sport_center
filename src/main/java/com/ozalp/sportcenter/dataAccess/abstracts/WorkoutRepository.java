package com.ozalp.sportcenter.dataAccess.abstracts;

import com.ozalp.sportcenter.entities.concretes.Workout;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface WorkoutRepository extends JpaRepository<Workout, UUID> {
}
