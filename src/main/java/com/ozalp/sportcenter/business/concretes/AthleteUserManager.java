package com.ozalp.sportcenter.business.concretes;

import com.ozalp.sportcenter.business.abstracts.*;
import com.ozalp.sportcenter.business.dto.responses.concretes.AthleteResponse;
import com.ozalp.sportcenter.common.utilities.results.DataResult;
import com.ozalp.sportcenter.common.utilities.results.SuccessDataResult;
import com.ozalp.sportcenter.entities.concretes.Athlete;
import com.ozalp.sportcenter.entities.concretes.Role;
import com.ozalp.sportcenter.entities.concretes.User;
import com.ozalp.sportcenter.entities.concretes.UserRole;
import com.ozalp.sportcenter.entities.enums.RoleEnum;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.UUID;

@Service
@AllArgsConstructor
public class AthleteUserManager implements AthleteUserService {

    private final AthleteService athleteService;
    private final RoleService roleService;
    private final UserRoleService userRoleService;

    @Transactional
    @Override
    public DataResult<AthleteResponse> createCoach(UUID athleteId) {
        Athlete athlete = athleteService.getById(athleteId);
        User athleteUser = athlete.getUser();

        Role coachRole = roleService.getByName(RoleEnum.ROLE_COACH);

        UserRole coachUserRole = new UserRole();
        coachUserRole.setUser(athleteUser);
        coachUserRole.setRole(coachRole);
        userRoleService.create(coachUserRole);


        return athleteService.getDtoById(athleteId);
    }
}
