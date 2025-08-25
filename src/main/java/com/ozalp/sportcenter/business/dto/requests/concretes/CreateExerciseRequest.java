package com.ozalp.sportcenter.business.dto.requests.concretes;

import com.ozalp.sportcenter.business.dto.requests.abstracts.BaseRequest;
import com.ozalp.sportcenter.entities.enums.MuscleGroup;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class CreateExerciseRequest extends BaseRequest {

    private String name;

    private String description;

    private String videoUrl;

    private Set<MuscleGroup> muscleGroups;

}
