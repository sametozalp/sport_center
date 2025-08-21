package com.ozalp.sportcenter.business.mappers;

import com.ozalp.sportcenter.business.dto.requests.concretes.CreateAthleteRequest;
import com.ozalp.sportcenter.business.dto.responses.AthleteResponse;
import com.ozalp.sportcenter.entities.concretes.Athlete;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AthleteMapper {

    Athlete toEntity(CreateAthleteRequest request);

    AthleteResponse toResponse(Athlete user);
}
