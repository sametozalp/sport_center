package com.ozalp.sportcenter.business.mappers;

import com.ozalp.sportcenter.business.dto.responses.concretes.CoachResponse;
import com.ozalp.sportcenter.entities.concretes.Coach;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CoachMapper {

    CoachResponse toResponse(Coach coach);

}
