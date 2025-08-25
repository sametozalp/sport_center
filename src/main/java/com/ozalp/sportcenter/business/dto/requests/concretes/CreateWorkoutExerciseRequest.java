package com.ozalp.sportcenter.business.dto.requests.concretes;

import com.ozalp.sportcenter.business.dto.requests.abstracts.BaseRequest;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class CreateWorkoutExerciseRequest extends BaseRequest {

    private UUID workoutId;

    private UUID exerciseId;

    private int sets;

    private int reps;

    private float weight;

    private int tempo;

    private int restSecondTime;
}
