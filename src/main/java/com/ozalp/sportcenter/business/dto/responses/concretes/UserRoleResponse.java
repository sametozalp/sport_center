package com.ozalp.sportcenter.business.dto.responses.concretes;

import com.ozalp.sportcenter.business.dto.responses.abstracts.BaseResponse;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRoleResponse extends BaseResponse {

    private UserResponse user;

    private RoleResponse role;

    private OrganizationResponse organization;
}
