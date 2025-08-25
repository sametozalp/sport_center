package com.ozalp.sportcenter.business.mappers;

import com.ozalp.sportcenter.business.dto.requests.concretes.CreateWorkoutExerciseRequest;
import com.ozalp.sportcenter.business.dto.responses.concretes.WorkoutExerciseResponse;
import com.ozalp.sportcenter.entities.concretes.WorkoutExercise;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface WorkoutExerciseMapper {
    WorkoutExerciseResponse toResponse(WorkoutExercise save);

    WorkoutExercise toEntity(CreateWorkoutExerciseRequest request);
}
