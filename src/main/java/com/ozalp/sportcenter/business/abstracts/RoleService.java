package com.ozalp.sportcenter.business.abstracts;

import com.ozalp.sportcenter.entities.concretes.Role;
import com.ozalp.sportcenter.entities.enums.RoleEnum;

public interface RoleService extends BaseService<Role> {

    Role getById(int id);

    Role create(RoleEnum roleEnum);

}
