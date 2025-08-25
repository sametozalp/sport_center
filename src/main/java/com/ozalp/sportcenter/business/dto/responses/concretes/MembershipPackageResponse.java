package com.ozalp.sportcenter.business.dto.responses.concretes;

import com.ozalp.sportcenter.business.dto.responses.abstracts.BaseResponse;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
public class MembershipPackageResponse extends BaseResponse {

    private UUID id;

    private String name;

    private String description;

    private BigDecimal price;

    private int durationDays;

}
