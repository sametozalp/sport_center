package com.ozalp.sportcenter.entities.concretes;

import com.ozalp.sportcenter.entities.abstracts.AuditableEntity;
import jakarta.persistence.*;

@Entity
@Table(name = "user_roles")
public class UserRole extends AuditableEntity {

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;

    @ManyToOne
    @JoinColumn(name = "organization_id")
    private Organization organization;
}
