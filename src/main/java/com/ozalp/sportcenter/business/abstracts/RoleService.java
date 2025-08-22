package com.ozalp.sportcenter.business.abstracts;

import com.ozalp.sportcenter.business.dto.responses.RoleResponse;
import com.ozalp.sportcenter.entities.concretes.Role;
import com.ozalp.sportcenter.entities.enums.RoleEnum;

import java.util.UUID;

public interface RoleService extends BaseService<Role, RoleResponse> {

    Role create(RoleEnum roleEnum);

}
