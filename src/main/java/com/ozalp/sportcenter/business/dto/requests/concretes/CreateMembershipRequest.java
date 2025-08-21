package com.ozalp.sportcenter.business.dto.requests.concretes;

import com.ozalp.sportcenter.business.dto.requests.abstracts.BaseRequest;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class CreateMembershipRequest extends BaseRequest {

    private int organizationId;

    private int athleteId;

    private int memberPackageId;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

}
