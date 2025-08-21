package com.ozalp.sportcenter.business.concretes;

import com.ozalp.sportcenter.business.abstracts.AthleteService;
import com.ozalp.sportcenter.business.dto.requests.concretes.CreateAthleteRequest;
import com.ozalp.sportcenter.business.mappers.AthleteMapper;
import com.ozalp.sportcenter.common.utilities.results.Result;
import com.ozalp.sportcenter.common.utilities.results.SuccessDataResult;
import com.ozalp.sportcenter.dataAccess.abstracts.AthleteRepository;
import com.ozalp.sportcenter.entities.concretes.Athlete;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AthleteManager implements AthleteService {

    private final AthleteRepository repository;
    private final AthleteMapper athleteMapper;

    @Override
    public Result create(CreateAthleteRequest request) {
        Athlete athlete = athleteMapper.toEntity(request);
        return create(athlete);
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
}
