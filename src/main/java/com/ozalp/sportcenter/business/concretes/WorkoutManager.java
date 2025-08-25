package com.ozalp.sportcenter.business.concretes;

import com.ozalp.sportcenter.business.abstracts.ProgramService;
import com.ozalp.sportcenter.business.abstracts.WorkoutService;
import com.ozalp.sportcenter.business.dto.requests.concretes.CreateWorkoutRequest;
import com.ozalp.sportcenter.business.dto.responses.concretes.WorkoutResponse;
import com.ozalp.sportcenter.business.mappers.WorkoutMapper;
import com.ozalp.sportcenter.common.utilities.results.DataResult;
import com.ozalp.sportcenter.common.utilities.results.Result;
import com.ozalp.sportcenter.common.utilities.results.SuccessDataResult;
import com.ozalp.sportcenter.dataAccess.abstracts.WorkoutRepository;
import com.ozalp.sportcenter.entities.concretes.Program;
import com.ozalp.sportcenter.entities.concretes.Workout;
import com.ozalp.sportcenter.exceptionHandler.exceptions.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class WorkoutManager implements WorkoutService {

    private final WorkoutRepository repository;
    private final WorkoutMapper workoutMapper;
    private final ProgramService programService;

    @Override
    public DataResult<WorkoutResponse> create(Workout workout) {
        return new SuccessDataResult<>(workoutMapper.toResponse(repository.save(workout)));
    }

    @Override
    public Result delete(Workout workout) {
        workout.markAsDeleted();
        return new SuccessDataResult<>(workoutMapper.toResponse(repository.save(workout)));
    }

    @Override
    public Workout getById(UUID id) {
        return repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(Workout.class, id));
    }

    @Override
    public DataResult<WorkoutResponse> getDtoById(UUID id) {
        return null;
    }

    @Override
    public DataResult<WorkoutResponse> create(CreateWorkoutRequest request) {
        Program program = programService.getById(request.getProgramId());
        Workout workout = workoutMapper.toEntity(request);
        workout.setProgram(program);
        return create(workout);
    }
}
