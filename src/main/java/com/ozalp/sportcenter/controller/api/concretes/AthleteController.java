package com.ozalp.sportcenter.controller.api.concretes;

import com.ozalp.sportcenter.business.abstracts.AthleteService;
import com.ozalp.sportcenter.controller.api.abstracts.BaseController;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/athlete")
@AllArgsConstructor
public class AthleteController implements BaseController {

    private final AthleteService athleteService;

//    @PostMapping("/assignCoach")
//    ResponseEntity<?> assignCoach(@RequestParam UUID athleteId, @RequestParam UUID coachId) {
//        return ResponseEntity.ok(athleteService.assignCoach(athleteId, coachId));
//    }
}
