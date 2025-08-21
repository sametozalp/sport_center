package com.ozalp.sportcenter.business.mappers;

import com.ozalp.sportcenter.business.dto.requests.concretes.CreateUserRequest;
import com.ozalp.sportcenter.business.dto.responses.concretes.UserResponse;
import com.ozalp.sportcenter.entities.concretes.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User toEntity(CreateUserRequest request);

    UserResponse toResponse(User user);

}
