package com.ozalp.sportcenter.business.concretes;

import com.ozalp.sportcenter.business.abstracts.RoleService;
import com.ozalp.sportcenter.business.dto.responses.concretes.RoleResponse;
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
    public DataResult<RoleResponse> create(Role role) {
        return new SuccessDataResult<>(roleMapper.toResponse(repository.save(role)));
    }

    @Override
    public Result delete(Role role) {
        role.markAsDeleted();
        return new SuccessDataResult<>(roleMapper.toResponse(repository.save(role)));
    }

    @Override
    public Role getById(UUID id) {
        return repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(Role.class, id));
    }

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

    @Override
    public Role getByName(RoleEnum roleEnum) {
        return repository.findByName(roleEnum);
    }

}
