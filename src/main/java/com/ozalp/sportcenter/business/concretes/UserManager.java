package com.ozalp.sportcenter.business.concretes;

import com.ozalp.sportcenter.business.abstracts.UserService;
import com.ozalp.sportcenter.business.dto.requests.concretes.CreateUserRequest;
import com.ozalp.sportcenter.business.mappers.UserMapper;
import com.ozalp.sportcenter.common.utilities.results.Result;
import com.ozalp.sportcenter.common.utilities.results.SuccessDataResult;
import com.ozalp.sportcenter.dataAccess.abstracts.UserRepository;
import com.ozalp.sportcenter.entities.concretes.User;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserManager implements UserService {

    private final UserRepository repository;
    private final UserMapper userMapper;

    @Override
    public Result create(User user) {
        User saved = repository.save(user);
        return new SuccessDataResult<>(userMapper.toResponse(saved));
    }

    @Transactional
    @Override
    public Result delete(User user) {
        user.markAsDeleted();
        repository.save(user);
        return new Result(true);
    }

    @Override
    public Result create(CreateUserRequest request) {
        User user = userMapper.toEntity(request);
        User savedUser = repository.save(user);
        return new SuccessDataResult<>(userMapper.toResponse(savedUser));
    }
}
