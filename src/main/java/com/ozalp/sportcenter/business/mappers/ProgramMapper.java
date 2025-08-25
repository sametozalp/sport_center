package com.ozalp.sportcenter.business.mappers;

import com.ozalp.sportcenter.business.dto.requests.concretes.CreateProgramRequest;
import com.ozalp.sportcenter.business.dto.responses.concretes.ProgramResponse;
import com.ozalp.sportcenter.entities.concretes.Program;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProgramMapper {

    ProgramResponse toResponse(Program program);

    Program toEntity(CreateProgramRequest request);
}
