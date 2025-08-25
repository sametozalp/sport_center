package com.ozalp.sportcenter.business.abstracts;

import com.ozalp.sportcenter.business.dto.requests.concretes.CreateWorkoutRequest;
import com.ozalp.sportcenter.business.dto.responses.concretes.WorkoutResponse;
import com.ozalp.sportcenter.common.utilities.results.DataResult;
import com.ozalp.sportcenter.entities.concretes.Workout;

public interface WorkoutService extends BaseService<Workout, WorkoutResponse> {

    DataResult<WorkoutResponse> create(CreateWorkoutRequest request);
}
