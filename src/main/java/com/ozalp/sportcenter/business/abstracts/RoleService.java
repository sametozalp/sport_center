package com.ozalp.sportcenter.business.abstracts;

import com.ozalp.sportcenter.business.dto.responses.concretes.RoleResponse;
import com.ozalp.sportcenter.entities.concretes.Role;
import com.ozalp.sportcenter.entities.enums.RoleEnum;

public interface RoleService extends BaseService<Role, RoleResponse> {

    Role create(RoleEnum roleEnum);

}
