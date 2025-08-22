package com.ozalp.sportcenter.business.dto.responses;

import com.ozalp.sportcenter.business.dto.responses.abstracts.BaseResponse;
import com.ozalp.sportcenter.entities.enums.RoleEnum;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RoleResponse extends BaseResponse {

    private RoleEnum name;

}
