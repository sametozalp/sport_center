package com.ozalp.sportcenter.business.concretes;

import com.ozalp.sportcenter.business.abstracts.ExerciseService;
import com.ozalp.sportcenter.business.dto.requests.concretes.CreateExerciseRequest;
import com.ozalp.sportcenter.business.dto.responses.concretes.ExerciseResponse;
import com.ozalp.sportcenter.business.mappers.ExerciseMapper;
import com.ozalp.sportcenter.business.mappers.ExerciseRepository;
import com.ozalp.sportcenter.common.utilities.results.DataResult;
import com.ozalp.sportcenter.common.utilities.results.Result;
import com.ozalp.sportcenter.common.utilities.results.SuccessDataResult;
import com.ozalp.sportcenter.entities.concretes.Exercise;
import com.ozalp.sportcenter.exceptionHandler.exceptions.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class ExerciseManager implements ExerciseService {

    private final ExerciseRepository repository;
    private final ExerciseMapper exerciseMapper;

    @Override
    public DataResult<ExerciseResponse> create(Exercise exercise) {
        return new SuccessDataResult<>(exerciseMapper.toResponse(repository.save(exercise)));
    }

    @Override
    public Result delete(Exercise exercise) {
        return null;
    }

    @Override
    public Exercise getById(UUID id) {
        return repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(Exercise.class, id));
    }

    @Override
    public DataResult<ExerciseResponse> getDtoById(UUID id) {
        Exercise exercise = getById(id);
        return new SuccessDataResult<>(exerciseMapper.toResponse(exercise));
    }

    @Override
    public DataResult<ExerciseResponse> create(CreateExerciseRequest request) {
        Exercise saved = repository.save(exerciseMapper.toEntity(request));
        return new SuccessDataResult<>(exerciseMapper.toResponse(saved));
    }
}
