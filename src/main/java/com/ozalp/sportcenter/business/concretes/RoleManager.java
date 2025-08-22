package com.ozalp.sportcenter.business.concretes;

import com.ozalp.sportcenter.business.abstracts.RoleService;
import com.ozalp.sportcenter.business.dto.responses.RoleResponse;
import com.ozalp.sportcenter.business.mappers.RoleMapper;
import com.ozalp.sportcenter.common.utilities.results.DataResult;
import com.ozalp.sportcenter.common.utilities.results.Result;
import com.ozalp.sportcenter.common.utilities.results.SuccessDataResult;
import com.ozalp.sportcenter.dataAccess.abstracts.RoleRepository;
import com.ozalp.sportcenter.entities.concretes.Role;
import com.ozalp.sportcenter.entities.enums.RoleEnum;
import com.ozalp.sportcenter.exceptionHandler.exceptions.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class RoleManager implements RoleService {

    private final RoleRepository repository;
    private final RoleMapper roleMapper;

    @Override
    public Result create(Role role) {
        repository.save(role);
        return new Result(true);
    }

    @Override
    public Result delete(Role role) {
        return null;
    }

    @Override
    public Role getById(UUID id) {
        return repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(Role.class, id));    }

    @Override
    public DataResult<RoleResponse> getDtoById(UUID id) {
        Role role = getById(id);
        return new SuccessDataResult<>(roleMapper.toResponse(role));
    }

    @Override
    public Role create(RoleEnum roleEnum) {
        Role roleEntity = new Role();
        roleEntity.setName(roleEnum);
        return repository.save(roleEntity);
    }

}
