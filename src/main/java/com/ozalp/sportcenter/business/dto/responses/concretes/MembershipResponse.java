package com.ozalp.sportcenter.business.dto.responses.concretes;

import com.ozalp.sportcenter.business.dto.responses.abstracts.BaseResponse;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
public class MembershipResponse extends BaseResponse {

    private UUID id;

    private OrganizationResponse organization;

    private AthleteResponse athlete;

    private MembershipPackageResponse membershipPackage;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

//    private MembershipStatus membershipStatus;
}
