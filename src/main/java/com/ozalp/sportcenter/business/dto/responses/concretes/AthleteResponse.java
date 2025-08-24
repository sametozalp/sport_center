package com.ozalp.sportcenter.business.dto.responses.concretes;

import com.ozalp.sportcenter.business.dto.responses.abstracts.BaseResponse;

import java.util.UUID;

public class AthleteResponse extends BaseResponse {

    private UUID id;
    private UserResponse user;
    private UserResponse coach;
    private MembershipResponse membership;
}
