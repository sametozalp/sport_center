package com.ozalp.sportcenter.business.concretes;

import com.ozalp.sportcenter.business.abstracts.AthleteService;
import com.ozalp.sportcenter.business.abstracts.CoachService;
import com.ozalp.sportcenter.business.dto.requests.concretes.CreateAthleteRequest;
import com.ozalp.sportcenter.business.dto.responses.concretes.AthleteResponse;
import com.ozalp.sportcenter.business.mappers.AthleteMapper;
import com.ozalp.sportcenter.common.utilities.results.DataResult;
import com.ozalp.sportcenter.common.utilities.results.Result;
import com.ozalp.sportcenter.common.utilities.results.SuccessDataResult;
import com.ozalp.sportcenter.dataAccess.abstracts.AthleteRepository;
import com.ozalp.sportcenter.entities.concretes.Athlete;
import com.ozalp.sportcenter.entities.concretes.Coach;
import com.ozalp.sportcenter.exceptionHandler.exceptions.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class AthleteManager implements AthleteService {

    private final AthleteRepository repository;
    private final AthleteMapper athleteMapper;
    private final CoachService coachService;

    @Override
    public Result create(CreateAthleteRequest request) {
        Athlete athlete = athleteMapper.toEntity(request);
        return create(athlete);
    }

    @Override
    public DataResult<AthleteResponse> assignCoach(UUID athleteId, UUID coachId) {
        Athlete athlete = getById(athleteId);
        Coach coach = coachService.getById(coachId);
        athlete.setCoach(coach);
        return new SuccessDataResult<>(athleteMapper.toResponse(athlete));
    }

    @Override
    public Result create(Athlete athlete) {
        Athlete saved = repository.save(athlete);
        return new SuccessDataResult<>(athleteMapper.toResponse(saved));
    }

    @Override
    public Result delete(Athlete athlete) {
        athlete.markAsDeleted();
        return new SuccessDataResult<>(athleteMapper.toResponse(repository.save(athlete)));
    }

    @Override
    public Athlete getById(UUID id) {
        return repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(Athlete.class, id));
    }

    @Override
    public DataResult<AthleteResponse> getDtoById(UUID id) {
        Athlete athlete = getById(id);
        return new SuccessDataResult<>(athleteMapper.toResponse(athlete));
    }

}
