package com.ozalp.sportcenter.business.concretes;

import com.ozalp.sportcenter.business.abstracts.ExerciseService;
import com.ozalp.sportcenter.business.abstracts.WorkoutExerciseService;
import com.ozalp.sportcenter.business.abstracts.WorkoutService;
import com.ozalp.sportcenter.business.dto.requests.concretes.CreateWorkoutExerciseRequest;
import com.ozalp.sportcenter.business.dto.responses.concretes.WorkoutExerciseResponse;
import com.ozalp.sportcenter.business.mappers.WorkoutExerciseMapper;
import com.ozalp.sportcenter.common.utilities.results.DataResult;
import com.ozalp.sportcenter.common.utilities.results.Result;
import com.ozalp.sportcenter.common.utilities.results.SuccessDataResult;
import com.ozalp.sportcenter.dataAccess.abstracts.WorkoutExerciseRepository;
import com.ozalp.sportcenter.entities.concretes.Exercise;
import com.ozalp.sportcenter.entities.concretes.Workout;
import com.ozalp.sportcenter.entities.concretes.WorkoutExercise;
import com.ozalp.sportcenter.exceptionHandler.exceptions.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class WorkoutExerciseManager implements WorkoutExerciseService {

    private final WorkoutExerciseRepository repository;
    private final WorkoutExerciseMapper workoutExerciseMapper;
    private final WorkoutService workoutService;
    private final ExerciseService exerciseService;

    @Override
    public DataResult<WorkoutExerciseResponse> create(WorkoutExercise workoutExercise) {
        return new SuccessDataResult<>(workoutExerciseMapper.toResponse(repository.save(workoutExercise)));
    }

    @Override
    public Result delete(WorkoutExercise workoutExercise) {
        return null;
    }

    @Override
    public WorkoutExercise getById(UUID id) {
        return repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(WorkoutExercise.class, id));
    }

    @Override
    public DataResult<WorkoutExerciseResponse> getDtoById(UUID id) {
        WorkoutExercise workoutExercise = getById(id);
        return new SuccessDataResult<>(workoutExerciseMapper.toResponse(workoutExercise));
    }

    @Override
    public DataResult<WorkoutExerciseResponse> create(CreateWorkoutExerciseRequest request) {
        Workout workout = workoutService.getById(request.getWorkoutId());
        Exercise exercise = exerciseService.getById(request.getExerciseId());

        WorkoutExercise workoutExercise = workoutExerciseMapper.toEntity(request);
        workoutExercise.setWorkout(workout);
        workoutExercise.setExercise(exercise);

        return create(workoutExercise);
    }
}
