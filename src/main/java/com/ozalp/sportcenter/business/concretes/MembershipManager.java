package com.ozalp.sportcenter.business.concretes;

import com.ozalp.sportcenter.business.abstracts.AthleteService;
import com.ozalp.sportcenter.business.abstracts.MembershipPackageService;
import com.ozalp.sportcenter.business.abstracts.MembershipService;
import com.ozalp.sportcenter.business.dto.requests.concretes.CreateMembershipRequest;
import com.ozalp.sportcenter.business.dto.responses.concretes.MembershipResponse;
import com.ozalp.sportcenter.business.mappers.MembershipMapper;
import com.ozalp.sportcenter.common.utilities.results.DataResult;
import com.ozalp.sportcenter.common.utilities.results.Result;
import com.ozalp.sportcenter.common.utilities.results.SuccessDataResult;
import com.ozalp.sportcenter.dataAccess.abstracts.MembershipRepository;
import com.ozalp.sportcenter.entities.concretes.Athlete;
import com.ozalp.sportcenter.entities.concretes.Membership;
import com.ozalp.sportcenter.entities.concretes.MembershipPackage;
import com.ozalp.sportcenter.exceptionHandler.exceptions.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
@AllArgsConstructor
public class MembershipManager implements MembershipService {

    private final MembershipMapper membershipMapper;
    private final MembershipRepository repository;
    private final MembershipPackageService membershipPackageService;
    private final AthleteService athleteService;

    @Override
    public DataResult<MembershipResponse> create(Membership membership) {
        return new SuccessDataResult<>(membershipMapper.toResponse(repository.save(membership)));
    }

    @Override
    public Result delete(Membership membership) {
        return null;
    }

    @Override
    public Membership getById(UUID id) {
        return repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(Membership.class, id));
    }

    @Override
    public DataResult<MembershipResponse> getDtoById(UUID id) {
        Membership membership = getById(id);
        return new SuccessDataResult<>(membershipMapper.toResponse(membership));
    }

    @Override
    public Result create(CreateMembershipRequest request) {
        MembershipPackage membershipPackage = membershipPackageService.getById(request.getMemberPackageId());
        Athlete athlete = athleteService.getById(request.getAthleteId());

        Membership membership = new Membership();
        membership.setAthlete(athlete);
        membership.setMembershipPackage(membershipPackage);
        membership.setStartDate(LocalDateTime.now());
        membership.setEndDate(LocalDateTime.now().plusDays(membershipPackage.getDurationDays()));
        membership.setOrganization(athlete.getUser().getOrganization());

        return create(membership);
    }
}
