package com.ozalp.sportcenter.controller.api.concretes;

import com.ozalp.sportcenter.business.abstracts.MembershipPackageService;
import com.ozalp.sportcenter.business.dto.requests.concretes.CreateMembershipPackageRequest;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/membershipPackage")
@AllArgsConstructor
public class MembershipPackageController {

    private final MembershipPackageService membershipPackageService;

    @PostMapping("/create")
    ResponseEntity<?> create(CreateMembershipPackageRequest request) {
        return ResponseEntity.ok(membershipPackageService.create(request));
    }
}
