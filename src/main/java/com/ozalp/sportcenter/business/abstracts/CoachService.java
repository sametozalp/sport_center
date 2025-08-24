package com.ozalp.sportcenter.business.abstracts;

import com.ozalp.sportcenter.business.dto.responses.concretes.CoachResponse;
import com.ozalp.sportcenter.common.utilities.results.Result;
import com.ozalp.sportcenter.entities.concretes.Coach;

import java.util.UUID;

public interface CoachService extends BaseService<Coach, CoachResponse> {

    // Result create(UUID userId);
}
