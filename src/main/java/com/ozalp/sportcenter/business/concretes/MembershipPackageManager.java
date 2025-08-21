package com.ozalp.sportcenter.business.concretes;

import com.ozalp.sportcenter.business.abstracts.MembershipPackageService;
import com.ozalp.sportcenter.business.dto.requests.concretes.CreateMembershipPackageRequest;
import com.ozalp.sportcenter.business.dto.responses.concretes.MembershipPackageResponse;
import com.ozalp.sportcenter.business.mappers.MembershipPackageMapper;
import com.ozalp.sportcenter.common.utilities.results.Result;
import com.ozalp.sportcenter.common.utilities.results.SuccessDataResult;
import com.ozalp.sportcenter.dataAccess.abstracts.MembershipPackageRepository;
import com.ozalp.sportcenter.entities.concretes.MembershipPackage;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MembershipPackageManager implements MembershipPackageService {

    private final MembershipPackageMapper membershipPackageMapper;
    private final MembershipPackageRepository repository;

    @Override
    public Result create(MembershipPackage membershipPackage) {
        return new SuccessDataResult<>(repository.save(membershipPackage));
    }

    @Override
    public Result delete(MembershipPackage membershipPackage) {
        return null;
    }

    @Override
    public Result create(CreateMembershipPackageRequest request) {
        MembershipPackage membershipPackage = membershipPackageMapper.toEntity(request);
        return create(membershipPackage);
    }
}
