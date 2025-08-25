package com.ozalp.sportcenter.controller.api.concretes;

import com.ozalp.sportcenter.business.abstracts.ProgramService;
import com.ozalp.sportcenter.business.dto.requests.concretes.CreateProgramRequest;
import com.ozalp.sportcenter.controller.api.abstracts.BaseController;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/program")
@AllArgsConstructor
public class ProgramController implements BaseController {

    private final ProgramService programService;

    @PostMapping("/create")
    ResponseEntity<?> create(@RequestBody CreateProgramRequest request) {
        return ResponseEntity.ok(programService.create(request));
    }
}
