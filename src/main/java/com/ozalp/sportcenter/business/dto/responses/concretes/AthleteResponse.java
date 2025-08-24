package com.ozalp.sportcenter.business.dto.responses.concretes;

import com.ozalp.sportcenter.business.dto.responses.abstracts.BaseResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class AthleteResponse extends BaseResponse {

    private UUID id;
    private UserResponse user;
    private UserResponse coach;
    private MembershipResponse membership;
}
