package com.ozalp.sportcenter.business.concretes;

import com.ozalp.sportcenter.business.abstracts.OrganizationService;
import com.ozalp.sportcenter.business.dto.requests.concretes.CreateOrganizationRequest;
import com.ozalp.sportcenter.business.dto.responses.concretes.OrganizationResponse;
import com.ozalp.sportcenter.business.mappers.OrganizationMapper;
import com.ozalp.sportcenter.common.utilities.results.DataResult;
import com.ozalp.sportcenter.common.utilities.results.Result;
import com.ozalp.sportcenter.common.utilities.results.SuccessDataResult;
import com.ozalp.sportcenter.dataAccess.abstracts.OrganizationRepository;
import com.ozalp.sportcenter.entities.concretes.Athlete;
import com.ozalp.sportcenter.entities.concretes.Organization;
import com.ozalp.sportcenter.exceptionHandler.exceptions.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class OrganizationManager implements OrganizationService {

    private final OrganizationMapper organizationMapper;
    private final OrganizationRepository repository;

    @Override
    public Result create(Organization organization) {
        return new SuccessDataResult<>(organizationMapper.toResponse(repository.save(organization)));
    }

    @Override
    public Result delete(Organization organization) {
        return null;
    }

    @Override
    public Organization getById(UUID id) {
        return repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(Organization.class, id));
    }

    @Override
    public DataResult<OrganizationResponse> getDtoById(UUID id) {
        Organization organization = getById(id);
        return new SuccessDataResult<>(organizationMapper.toResponse(organization));
    }

    @Override
    public Result create(CreateOrganizationRequest request) {
        Organization organization = organizationMapper.toEntity(request);
        return create(organization);
    }
}
