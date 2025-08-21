package com.ozalp.sportcenter.controller.api.concretes;

import com.ozalp.sportcenter.business.abstracts.OrganizationService;
import com.ozalp.sportcenter.business.dto.requests.concretes.CreateOrganizationRequest;
import com.ozalp.sportcenter.controller.api.abstracts.BaseController;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/organization")
@AllArgsConstructor
public class OrganizationController implements BaseController {

    private final OrganizationService organizationService;

    @PostMapping("/create")
    ResponseEntity<?> create(CreateOrganizationRequest request) {
        return ResponseEntity.ok(organizationService.create(request));
    }
}
