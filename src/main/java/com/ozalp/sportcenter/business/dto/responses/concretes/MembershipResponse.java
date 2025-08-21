package com.ozalp.sportcenter.business.dto.responses.concretes;

import com.ozalp.sportcenter.business.dto.responses.AthleteResponse;
import com.ozalp.sportcenter.business.dto.responses.abstracts.BaseResponse;
import com.ozalp.sportcenter.entities.enums.MembershipStatus;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class MembershipResponse extends BaseResponse {

    private OrganizationResponse organization;

    private AthleteResponse athlete;

    private MembershipPackageResponse membershipPackage;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    private MembershipStatus membershipStatus;
}
