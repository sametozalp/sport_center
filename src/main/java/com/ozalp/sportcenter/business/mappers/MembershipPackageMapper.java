package com.ozalp.sportcenter.business.mappers;

import com.ozalp.sportcenter.business.dto.requests.concretes.CreateMembershipPackageRequest;
import com.ozalp.sportcenter.business.dto.responses.concretes.MembershipPackageResponse;
import com.ozalp.sportcenter.entities.concretes.MembershipPackage;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MembershipPackageMapper {

    MembershipPackageResponse toResponse(MembershipPackage membershipPackage);

    MembershipPackage toEntity(CreateMembershipPackageRequest request);

}
