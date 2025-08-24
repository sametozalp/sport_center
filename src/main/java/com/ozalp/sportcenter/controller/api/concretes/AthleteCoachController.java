package com.ozalp.sportcenter.controller.api.concretes;

import com.ozalp.sportcenter.business.abstracts.AthleteCoachService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/athleteCoach")
@AllArgsConstructor
public class AthleteCoachController {

    private final AthleteCoachService athleteCoachService;

    @PostMapping("/assignCoachToAthlete")
    ResponseEntity<?> assignCoachToAthlete(@RequestParam UUID athleteId, @RequestParam UUID coachId) {
        return ResponseEntity.ok(athleteCoachService.assignCoachToAthlete(athleteId, coachId));
    }
}
