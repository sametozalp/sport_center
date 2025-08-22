package com.ozalp.sportcenter.business.abstracts;

import com.ozalp.sportcenter.entities.concretes.Coach;

import java.util.UUID;

public interface CoachLookupService {
    Coach getById(UUID id);
}