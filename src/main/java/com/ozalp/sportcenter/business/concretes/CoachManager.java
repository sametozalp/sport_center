package com.ozalp.sportcenter.business.concretes;

import com.ozalp.sportcenter.business.abstracts.CoachService;
import com.ozalp.sportcenter.business.abstracts.UserService;
import com.ozalp.sportcenter.business.dto.responses.concretes.CoachResponse;
import com.ozalp.sportcenter.business.mappers.CoachMapper;
import com.ozalp.sportcenter.common.utilities.results.DataResult;
import com.ozalp.sportcenter.common.utilities.results.Result;
import com.ozalp.sportcenter.common.utilities.results.SuccessDataResult;
import com.ozalp.sportcenter.dataAccess.abstracts.CoachRepository;
import com.ozalp.sportcenter.entities.concretes.Coach;
import com.ozalp.sportcenter.entities.concretes.User;
import com.ozalp.sportcenter.exceptionHandler.exceptions.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class CoachManager implements CoachService {

    private final CoachRepository repository;
    private final CoachMapper coachMapper;
    private final UserService userService;

    @Override
    public DataResult<CoachResponse> create(Coach coach) {
        Coach saved = repository.save(coach);
        return new SuccessDataResult<>(coachMapper.toResponse(saved));
    }

    @Override
    public Result delete(Coach coach) {
        return null;
    }

    @Override
    public Coach getById(UUID id) {
        return repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(Coach.class, id));    }

    @Override
    public DataResult<CoachResponse> getDtoById(UUID id) {
        return null;
    }

//    @Override
//    public Result create(UUID userId) {
//        User user = userService.getById(userId);
//        Coach coach = new Coach();
//        coach.setUser(user);
//        return new SuccessDataResult<>(coachMapper.toResponse(repository.save(coach)));
//    }
}
