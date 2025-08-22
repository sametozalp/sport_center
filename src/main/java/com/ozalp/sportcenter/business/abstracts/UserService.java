package com.ozalp.sportcenter.business.abstracts;

import com.ozalp.sportcenter.business.dto.requests.concretes.CreateUserRequest;
import com.ozalp.sportcenter.business.dto.responses.concretes.UserResponse;
import com.ozalp.sportcenter.common.utilities.results.Result;
import com.ozalp.sportcenter.entities.concretes.User;

public interface UserService extends BaseService<User, UserResponse> {

    Result create(CreateUserRequest request);

}
