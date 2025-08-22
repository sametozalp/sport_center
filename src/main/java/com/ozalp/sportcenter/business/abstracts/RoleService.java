package com.ozalp.sportcenter.business.abstracts;

import com.ozalp.sportcenter.entities.concretes.Role;
import com.ozalp.sportcenter.entities.enums.RoleEnum;

import java.util.UUID;

public interface RoleService extends BaseService<Role> {

    Role getById(UUID id);

    Role create(RoleEnum roleEnum);

}
