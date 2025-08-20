package com.ozalp.sportcenter.entities.concretes;

import com.ozalp.sportcenter.entities.abstracts.AuditableEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
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

    //private int subscriptionPlan;

}
