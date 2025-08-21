package com.ozalp.sportcenter.business.concretes;

import com.ozalp.sportcenter.business.abstracts.UserRoleService;
import com.ozalp.sportcenter.common.utilities.results.Result;
import com.ozalp.sportcenter.dataAccess.abstracts.UserRoleRepository;
import com.ozalp.sportcenter.entities.concretes.UserRole;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserRoleManager implements UserRoleService {

    private final UserRoleRepository repository;

    @Override
    public Result create(UserRole userRole) {
        repository.save(userRole);
        return new Result(true);
    }

    @Override
    public Result delete(UserRole userRole) {
        return null;
    }
}
