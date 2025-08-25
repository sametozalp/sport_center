package com.ozalp.sportcenter.business.abstracts;

import com.ozalp.sportcenter.business.dto.requests.concretes.CreateProgramRequest;
import com.ozalp.sportcenter.business.dto.responses.concretes.ProgramResponse;
import com.ozalp.sportcenter.common.utilities.results.DataResult;
import com.ozalp.sportcenter.entities.concretes.Program;

public interface ProgramService extends BaseService<Program, ProgramResponse> {

    DataResult<ProgramResponse> create(CreateProgramRequest request);
}
