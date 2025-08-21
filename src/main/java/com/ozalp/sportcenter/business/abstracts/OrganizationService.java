package com.ozalp.sportcenter.business.abstracts;

import com.ozalp.sportcenter.business.dto.requests.concretes.CreateOrganizationRequest;
import com.ozalp.sportcenter.common.utilities.results.Result;
import com.ozalp.sportcenter.entities.concretes.Organization;

public interface OrganizationService extends BaseService<Organization> {

    Result create(CreateOrganizationRequest request);

}
