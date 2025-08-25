package com.ozalp.sportcenter.business.mappers;

import com.ozalp.sportcenter.business.dto.requests.concretes.CreateExerciseRequest;
import com.ozalp.sportcenter.business.dto.responses.concretes.ExerciseResponse;
import com.ozalp.sportcenter.entities.concretes.Exercise;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ExerciseMapper {
    ExerciseResponse toResponse(Exercise exercise);

    Exercise toEntity(CreateExerciseRequest request);
}
