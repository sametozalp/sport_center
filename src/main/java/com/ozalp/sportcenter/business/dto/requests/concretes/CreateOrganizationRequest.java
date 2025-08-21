package com.ozalp.sportcenter.business.dto.requests.concretes;

import com.ozalp.sportcenter.business.dto.requests.abstracts.BaseRequest;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateOrganizationRequest extends BaseRequest {

    private String name;

    private String logoUrl;
}
