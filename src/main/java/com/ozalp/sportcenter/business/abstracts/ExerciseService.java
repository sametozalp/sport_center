package com.ozalp.sportcenter.business.abstracts;

import com.ozalp.sportcenter.business.dto.requests.concretes.CreateExerciseRequest;
import com.ozalp.sportcenter.business.dto.responses.concretes.ExerciseResponse;
import com.ozalp.sportcenter.common.utilities.results.DataResult;
import com.ozalp.sportcenter.entities.concretes.Exercise;

import javax.xml.crypto.Data;

public interface ExerciseService extends BaseService<Exercise, ExerciseResponse> {

    DataResult<ExerciseResponse> create(CreateExerciseRequest request);
}
