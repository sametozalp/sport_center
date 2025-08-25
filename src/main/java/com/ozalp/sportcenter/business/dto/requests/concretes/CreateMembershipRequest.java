package com.ozalp.sportcenter.business.dto.requests.concretes;

import com.ozalp.sportcenter.business.dto.requests.abstracts.BaseRequest;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
public class CreateMembershipRequest extends BaseRequest {
//
//    private UUID organizationId;

    private UUID athleteId;

    private UUID memberPackageId;

//    private LocalDateTime startDate;
//
//    private LocalDateTime endDate;

}
