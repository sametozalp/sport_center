package com.ozalp.sportcenter.controller.api.concretes;

import com.ozalp.sportcenter.business.abstracts.WorkoutExerciseService;
import com.ozalp.sportcenter.business.dto.requests.concretes.CreateWorkoutExerciseRequest;
import com.ozalp.sportcenter.controller.api.abstracts.BaseController;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/workoutExercise")
@AllArgsConstructor
public class WorkoutExerciseController implements BaseController {

    private WorkoutExerciseService workoutExerciseService;

    @PostMapping("/create")
    ResponseEntity<?> create(CreateWorkoutExerciseRequest request) {
        return ResponseEntity.ok(workoutExerciseService.create(request));
    }
}
