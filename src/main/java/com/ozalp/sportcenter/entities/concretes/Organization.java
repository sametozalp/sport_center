package com.ozalp.sportcenter.entities.concretes;

import com.ozalp.sportcenter.entities.abstracts.AuditableEntity;
import com.ozalp.sportcenter.entities.enums.OrganizationStatus;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "organizations")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Organization extends AuditableEntity {

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "logo_url")
    private String logoUrl;

    @Enumerated(EnumType.STRING)
    @Column(name = "organization_status")
    private OrganizationStatus organizationStatus = OrganizationStatus.ACTIVE;

    //private int subscriptionPlan;

}
