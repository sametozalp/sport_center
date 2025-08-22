package com.ozalp.sportcenter.business.abstracts;

import com.ozalp.sportcenter.business.dto.requests.concretes.CreateAthleteRequest;
import com.ozalp.sportcenter.business.dto.responses.concretes.AthleteResponse;
import com.ozalp.sportcenter.common.utilities.results.DataResult;
import com.ozalp.sportcenter.common.utilities.results.Result;
import com.ozalp.sportcenter.entities.concretes.Athlete;

import java.util.UUID;

public interface AthleteService extends BaseService<Athlete, AthleteResponse> {

    Result create(CreateAthleteRequest request);

    DataResult<AthleteResponse> assignCoach(UUID athleteId, UUID coachId);

}
