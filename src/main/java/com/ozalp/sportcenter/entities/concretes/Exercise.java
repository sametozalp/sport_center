package com.ozalp.sportcenter.entities.concretes;

import com.ozalp.sportcenter.entities.abstracts.AuditableEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "exercises")
public class Exercise extends AuditableEntity {
}
