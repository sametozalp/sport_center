package com.ozalp.sportcenter.business.concretes;

import com.ozalp.sportcenter.business.abstracts.RoleService;
import com.ozalp.sportcenter.common.utilities.results.Result;
import com.ozalp.sportcenter.dataAccess.abstracts.RoleRepository;
import com.ozalp.sportcenter.entities.concretes.Role;
import com.ozalp.sportcenter.entities.enums.RoleEnum;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RoleManager implements RoleService {

    private final RoleRepository repository;

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
    public Role getById(int id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public Role create(RoleEnum roleEnum) {
        Role roleEntity = new Role();
        roleEntity.setName(roleEnum);
        return repository.save(roleEntity);
    }

}
