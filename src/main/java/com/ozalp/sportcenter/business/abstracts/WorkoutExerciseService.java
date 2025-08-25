package com.ozalp.sportcenter.business.abstracts;

import com.ozalp.sportcenter.business.dto.requests.concretes.CreateWorkoutExerciseRequest;
import com.ozalp.sportcenter.business.dto.responses.concretes.WorkoutExerciseResponse;
import com.ozalp.sportcenter.common.utilities.results.DataResult;
import com.ozalp.sportcenter.entities.concretes.WorkoutExercise;

public interface WorkoutExerciseService extends BaseService<WorkoutExercise, WorkoutExerciseResponse> {
    DataResult<WorkoutExerciseResponse> create(CreateWorkoutExerciseRequest request);
}
