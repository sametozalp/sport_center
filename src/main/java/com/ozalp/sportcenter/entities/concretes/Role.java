package com.ozalp.sportcenter.entities.concretes;

import com.ozalp.sportcenter.entities.abstracts.AuditableEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "roles")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Role extends AuditableEntity {

    @Column(name = "name", unique = true, nullable = false)
    private String name;
}
