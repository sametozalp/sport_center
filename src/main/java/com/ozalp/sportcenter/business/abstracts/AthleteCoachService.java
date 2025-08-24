package com.ozalp.sportcenter.business.abstracts;

import com.ozalp.sportcenter.business.dto.responses.concretes.AthleteResponse;
import com.ozalp.sportcenter.common.utilities.results.DataResult;

import java.util.UUID;

public interface AthleteCoachService {

    DataResult<AthleteResponse> assignCoachToAthlete(UUID athleteId, UUID coachId);

}
