package com.ozalp.sportcenter.business.mappers;

import com.ozalp.sportcenter.business.dto.requests.concretes.CreateOrganizationRequest;
import com.ozalp.sportcenter.business.dto.responses.concretes.OrganizationResponse;
import com.ozalp.sportcenter.entities.concretes.Organization;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrganizationMapper {

    OrganizationResponse toResponse(Organization organization);

    Organization toEntity(CreateOrganizationRequest request);
}
