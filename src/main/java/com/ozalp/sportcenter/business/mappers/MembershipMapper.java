package com.ozalp.sportcenter.business.mappers;

import com.ozalp.sportcenter.business.dto.requests.concretes.CreateMembershipRequest;
import com.ozalp.sportcenter.business.dto.responses.concretes.MembershipResponse;
import com.ozalp.sportcenter.entities.concretes.Membership;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {AthleteMapper.class})
public interface MembershipMapper {

    Membership toEntity(CreateMembershipRequest request);

    MembershipResponse toResponse(Membership membership);

}
