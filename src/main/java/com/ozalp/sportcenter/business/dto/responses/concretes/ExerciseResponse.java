package com.ozalp.sportcenter.business.dto.responses.concretes;

import com.ozalp.sportcenter.business.dto.responses.abstracts.BaseResponse;
import com.ozalp.sportcenter.entities.enums.MuscleGroup;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;
import java.util.UUID;

@Getter
@Setter
public class ExerciseResponse extends BaseResponse {

    private UUID id;

    private String name;

    private String description;

    private String videoUrl;

    private Set<MuscleGroup> muscleGroups;
}
