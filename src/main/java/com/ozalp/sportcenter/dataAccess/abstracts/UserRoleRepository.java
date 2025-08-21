package com.ozalp.sportcenter.dataAccess.abstracts;

import com.ozalp.sportcenter.entities.concretes.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRoleRepository extends JpaRepository<UserRole, Integer> {
}
