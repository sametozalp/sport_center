package com.ozalp.sportcenter.business.concretes;

import com.ozalp.sportcenter.business.abstracts.AthleteService;
import com.ozalp.sportcenter.business.abstracts.ProgramService;
import com.ozalp.sportcenter.business.dto.requests.concretes.CreateProgramRequest;
import com.ozalp.sportcenter.business.dto.responses.concretes.ProgramResponse;
import com.ozalp.sportcenter.business.mappers.ProgramMapper;
import com.ozalp.sportcenter.common.utilities.results.DataResult;
import com.ozalp.sportcenter.common.utilities.results.Result;
import com.ozalp.sportcenter.common.utilities.results.SuccessDataResult;
import com.ozalp.sportcenter.dataAccess.abstracts.ProgramRepository;
import com.ozalp.sportcenter.entities.concretes.Athlete;
import com.ozalp.sportcenter.entities.concretes.Program;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class ProgramManager implements ProgramService {

    private final ProgramRepository repository;
    private final ProgramMapper programMapper;
    private final AthleteService athleteService;

    @Override
    public DataResult<ProgramResponse> create(Program program) {
        return new SuccessDataResult<>(programMapper.toResponse(repository.save(program)));
    }

    @Override
    public Result delete(Program program) {
        return null;
    }

    @Override
    public Program getById(UUID id) {
        return null;
    }

    @Override
    public DataResult<ProgramResponse> getDtoById(UUID id) {
        return null;
    }

    @Override
    public DataResult<ProgramResponse> create(CreateProgramRequest request) {
        Athlete athlete = athleteService.getById(request.getAthleteId());
        Athlete coach = athleteService.getCoachById(request.getCoachId());
        Program program = programMapper.toEntity(request);
        program.setAthlete(athlete);
        program.setCoach(coach);
        return create(program);
    }
}
