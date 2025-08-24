package com.ozalp.sportcenter.business.concretes;

import com.ozalp.sportcenter.business.abstracts.AthleteService;
import com.ozalp.sportcenter.business.abstracts.AthleteCoachService;
import com.ozalp.sportcenter.business.abstracts.CoachService;
import com.ozalp.sportcenter.business.abstracts.UserService;
import com.ozalp.sportcenter.business.dto.responses.concretes.AthleteResponse;
import com.ozalp.sportcenter.business.mappers.AthleteMapper;
import com.ozalp.sportcenter.common.utilities.results.DataResult;
import com.ozalp.sportcenter.common.utilities.results.SuccessDataResult;
import com.ozalp.sportcenter.entities.concretes.Athlete;
import com.ozalp.sportcenter.entities.concretes.Coach;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class AthleteCoachManager implements AthleteCoachService {

    private final CoachService coachService;
    private final AthleteService athleteService;
    private final AthleteMapper athleteMapper;

    @Override
    public DataResult<AthleteResponse> assignCoachToAthlete(UUID athleteId, UUID coachId) {
        Athlete athlete = athleteService.getById(athleteId);
        Coach coach = coachService.getById(coachId);
        athlete.setCoach(coach);
        return new SuccessDataResult<>(athleteMapper.toResponse(athlete));
    }
}
