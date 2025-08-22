package com.ozalp.sportcenter.business.mappers;

import com.ozalp.sportcenter.business.dto.responses.UserRoleResponse;
import com.ozalp.sportcenter.entities.concretes.UserRole;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserRoleMapper {

    UserRoleResponse toResponse(UserRole userRole);

}
