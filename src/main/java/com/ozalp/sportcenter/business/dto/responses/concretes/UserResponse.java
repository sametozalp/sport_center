package com.ozalp.sportcenter.business.dto.responses.concretes;

import com.ozalp.sportcenter.business.dto.responses.abstracts.BaseResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class UserResponse extends BaseResponse {

    private UUID id;
    private String firstName;
    private String lastName;

}
