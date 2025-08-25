package com.ozalp.sportcenter.controller.api.concretes;

import com.ozalp.sportcenter.business.abstracts.WorkoutService;
import com.ozalp.sportcenter.business.dto.requests.concretes.CreateWorkoutRequest;
import com.ozalp.sportcenter.controller.api.abstracts.BaseController;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/workout")
@AllArgsConstructor
public class WorkoutController implements BaseController {

    private WorkoutService workoutService;

    @PostMapping("/create")
    ResponseEntity<?> create(CreateWorkoutRequest request) {
        return ResponseEntity.ok(workoutService.create(request));
    }
}
