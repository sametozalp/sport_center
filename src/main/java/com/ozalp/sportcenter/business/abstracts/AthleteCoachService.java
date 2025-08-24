package com.ozalp.sportcenter.business.abstracts;

import com.ozalp.sportcenter.business.dto.responses.concretes.AthleteResponse;
import com.ozalp.sportcenter.business.dto.responses.concretes.CoachResponse;
import com.ozalp.sportcenter.common.utilities.results.DataResult;
import com.ozalp.sportcenter.common.utilities.results.Result;

import java.util.UUID;

public interface AthleteCoachService {

    DataResult<AthleteResponse> assignCoachToAthlete(UUID athleteId, UUID coachId);

    DataResult<CoachResponse> createCoach(UUID athleteId);

}
