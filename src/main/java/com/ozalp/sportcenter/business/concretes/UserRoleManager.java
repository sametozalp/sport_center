package com.ozalp.sportcenter.business.concretes;

import com.ozalp.sportcenter.business.abstracts.UserRoleService;
import com.ozalp.sportcenter.business.dto.responses.UserRoleResponse;
import com.ozalp.sportcenter.business.mappers.UserRoleMapper;
import com.ozalp.sportcenter.common.utilities.results.DataResult;
import com.ozalp.sportcenter.common.utilities.results.Result;
import com.ozalp.sportcenter.common.utilities.results.SuccessDataResult;
import com.ozalp.sportcenter.dataAccess.abstracts.UserRoleRepository;
import com.ozalp.sportcenter.entities.concretes.UserRole;
import com.ozalp.sportcenter.exceptionHandler.exceptions.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class UserRoleManager implements UserRoleService {

    private final UserRoleRepository repository;
    private final UserRoleMapper userRoleMapper;

    @Override
    public Result create(UserRole userRole) {
        repository.save(userRole);
        return new Result(true);
    }

    @Override
    public Result delete(UserRole userRole) {
        return null;
    }

    @Override
    public UserRole getById(UUID id) {
        return repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(UserRole.class, id));
    }

    @Override
    public DataResult<UserRoleResponse> getDtoById(UUID id) {
        UserRole userRole = getById(id);
        return new SuccessDataResult<>(userRoleMapper.toResponse(userRole));
    }
}
