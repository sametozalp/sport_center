package com.ozalp.sportcenter.business.mappers;

import com.ozalp.sportcenter.business.dto.responses.concretes.RoleResponse;
import com.ozalp.sportcenter.entities.concretes.Role;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RoleMapper {

    RoleResponse toResponse(Role user);

}
