package com.ozalp.sportcenter.controller.api.concretes;

import com.ozalp.sportcenter.business.abstracts.AthleteUserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@AllArgsConstructor
@RequestMapping("/api/athleteUser")
public class AthleteUserController {

    private final AthleteUserService athleteUserService;

    @PostMapping("/createCoach")
    ResponseEntity<?> createCoach(@RequestParam UUID athleteId) {
        return ResponseEntity.ok(athleteUserService.createCoach(athleteId));
    }
}
