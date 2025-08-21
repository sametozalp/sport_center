package com.ozalp.sportcenter.business.dto.requests.concretes;

import com.ozalp.sportcenter.business.dto.requests.abstracts.BaseRequest;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class CreateMembershipPackageRequest extends BaseRequest {

    private String name;

    private String description;

    private BigDecimal price;

    private int durationDays;
}
