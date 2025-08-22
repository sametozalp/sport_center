package com.ozalp.sportcenter.controller.api.concretes;

import com.ozalp.sportcenter.business.abstracts.CoachService;
import com.ozalp.sportcenter.common.utilities.results.SuccessDataResult;
import com.ozalp.sportcenter.controller.api.abstracts.BaseController;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/coach")
@AllArgsConstructor
public class CoachController implements BaseController {

    private final CoachService coachService;

    @PostMapping("/create")
    ResponseEntity<?> create(@RequestParam UUID athleteId) {
        return ResponseEntity.ok(new SuccessDataResult<>(coachService.create(athleteId)));
    }
}
