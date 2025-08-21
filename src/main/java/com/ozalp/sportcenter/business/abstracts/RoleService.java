package com.ozalp.sportcenter.business.abstracts;

import com.ozalp.sportcenter.entities.concretes.Role;

public interface RoleService extends BaseService<Role> {

    Role getById(int id);

    Role create(String role);

}
