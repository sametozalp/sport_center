package com.ozalp.sportcenter.business.dto.responses.concretes;

import com.ozalp.sportcenter.business.dto.responses.abstracts.BaseResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class WorkoutExerciseResponse extends BaseResponse {

    private UUID id;

    private UUID workoutId;

    private int sets;

    private int reps;

    private float weight;

    private int tempo;

    private int restSecondTime;
}
