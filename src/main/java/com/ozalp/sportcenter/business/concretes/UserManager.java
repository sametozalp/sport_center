package com.ozalp.sportcenter.business.concretes;

import com.ozalp.sportcenter.business.abstracts.AthleteService;
import com.ozalp.sportcenter.business.abstracts.RoleService;
import com.ozalp.sportcenter.business.abstracts.UserService;
import com.ozalp.sportcenter.business.dto.requests.concretes.CreateUserRequest;
import com.ozalp.sportcenter.business.dto.responses.concretes.UserResponse;
import com.ozalp.sportcenter.business.mappers.UserMapper;
import com.ozalp.sportcenter.common.utilities.results.DataResult;
import com.ozalp.sportcenter.common.utilities.results.Result;
import com.ozalp.sportcenter.common.utilities.results.SuccessDataResult;
import com.ozalp.sportcenter.dataAccess.abstracts.UserRepository;
import com.ozalp.sportcenter.entities.concretes.Athlete;
import com.ozalp.sportcenter.entities.concretes.Role;
import com.ozalp.sportcenter.entities.concretes.User;
import com.ozalp.sportcenter.entities.concretes.UserRole;
import com.ozalp.sportcenter.exceptionHandler.exceptions.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@AllArgsConstructor
public class UserManager implements UserService {

    private final UserRepository repository;
    private final UserMapper userMapper;
    private final PasswordEncoder passwordEncoder;
    private final AthleteService athleteService;
    private final RoleService roleService;

    @Override
    public Result create(User user) {
        User saved = repository.save(user);
        return new SuccessDataResult<>(userMapper.toResponse(saved));
    }

    @Transactional
    @Override
    public Result delete(User user) {
        user.markAsDeleted();
        repository.save(user);
        return new Result(true);
    }

    @Override
    public User getById(UUID id) {
        return repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(User.class, id));
    }

    @Override
    public DataResult<UserResponse> getDtoById(UUID id) {
        User user = getById(id);
        return new SuccessDataResult<>(userMapper.toResponse(user));
    }

    @Transactional
    @Override
    public Result create(CreateUserRequest request) {
        User user = userMapper.toEntity(request);
        user.setPassword(passwordEncoder.encode(request.getPassword()));

        UserRole userRole = new UserRole();
        userRole.setUser(user);

        Role role = roleService.getById(request.getRoleId());
        userRole.setRole(role);

        Set<UserRole> userRoleList = new HashSet<>();
        userRoleList.add(userRole);
        user.setRoles(userRoleList);

        User savedUser = repository.save(user);

        Athlete athlete = new Athlete();
        athlete.setUser(savedUser);
        athleteService.create(athlete);

        return new SuccessDataResult<>(userMapper.toResponse(savedUser));
    }
}
