package com.ozalp.sportcenter.business.concretes;

import com.ozalp.sportcenter.business.abstracts.MembershipService;
import com.ozalp.sportcenter.business.dto.requests.concretes.CreateMembershipRequest;
import com.ozalp.sportcenter.business.mappers.MembershipMapper;
import com.ozalp.sportcenter.common.utilities.results.Result;
import com.ozalp.sportcenter.common.utilities.results.SuccessDataResult;
import com.ozalp.sportcenter.dataAccess.abstracts.MembershipRepository;
import com.ozalp.sportcenter.entities.concretes.Membership;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MembershipManager implements MembershipService {

    private final MembershipMapper membershipMapper;
    private final MembershipRepository repository;

    @Override
    public Result create(Membership membership) {
        return new SuccessDataResult<>(membershipMapper.toResponse(repository.save(membership)));
    }

    @Override
    public Result delete(Membership membership) {
        return null;
    }

    @Override
    public Result create(CreateMembershipRequest request) {
        Membership membership = membershipMapper.toEntity(request);
        return create(membership);
    }
}
