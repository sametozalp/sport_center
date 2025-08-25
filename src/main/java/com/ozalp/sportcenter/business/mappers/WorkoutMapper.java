package com.ozalp.sportcenter.business.mappers;

import com.ozalp.sportcenter.business.dto.requests.concretes.CreateWorkoutRequest;
import com.ozalp.sportcenter.business.dto.responses.concretes.WorkoutResponse;
import com.ozalp.sportcenter.entities.concretes.Workout;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface WorkoutMapper {
    WorkoutResponse toResponse(Workout workout);

    Workout toEntity(CreateWorkoutRequest request);
}
