package com.ozalp.sportcenter.business.dto.requests.concretes;

import com.ozalp.sportcenter.business.dto.requests.abstracts.BaseRequest;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateUserRequest extends BaseRequest {

    private String firstName;

    private String lastName;

    private String email;

    private String phone;

    private String password;

    private int roleId;

}
