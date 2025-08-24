package com.ozalp.sportcenter.business.concretes;

import com.ozalp.sportcenter.business.abstracts.MembershipPackageService;
import com.ozalp.sportcenter.business.dto.requests.concretes.CreateMembershipPackageRequest;
import com.ozalp.sportcenter.business.dto.responses.concretes.MembershipPackageResponse;
import com.ozalp.sportcenter.business.mappers.MembershipPackageMapper;
import com.ozalp.sportcenter.common.utilities.results.DataResult;
import com.ozalp.sportcenter.common.utilities.results.Result;
import com.ozalp.sportcenter.common.utilities.results.SuccessDataResult;
import com.ozalp.sportcenter.dataAccess.abstracts.MembershipPackageRepository;
import com.ozalp.sportcenter.entities.concretes.Athlete;
import com.ozalp.sportcenter.entities.concretes.MembershipPackage;
import com.ozalp.sportcenter.exceptionHandler.exceptions.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class MembershipPackageManager implements MembershipPackageService {

    private final MembershipPackageMapper membershipPackageMapper;
    private final MembershipPackageRepository repository;

    @Override
    public DataResult<MembershipPackageResponse> create(MembershipPackage membershipPackage) {
        return new SuccessDataResult<>(membershipPackageMapper.toResponse(repository.save(membershipPackage)));
    }

    @Override
    public Result delete(MembershipPackage membershipPackage) {
        return null;
    }

    @Override
    public MembershipPackage getById(UUID id) {
        return repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(MembershipPackage.class, id));
    }

    @Override
    public DataResult<MembershipPackageResponse> getDtoById(UUID id) {
        MembershipPackage membershipPackage = getById(id);
        return new SuccessDataResult<>(membershipPackageMapper.toResponse(membershipPackage));
    }

    @Override
    public Result create(CreateMembershipPackageRequest request) {
        MembershipPackage membershipPackage = membershipPackageMapper.toEntity(request);
        return create(membershipPackage);
    }
}
