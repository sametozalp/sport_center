package com.ozalp.sportcenter.business.mappers;

import com.ozalp.sportcenter.entities.concretes.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ExerciseRepository extends JpaRepository<Exercise, UUID> {
}
