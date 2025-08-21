package com.ozalp.sportcenter.business.abstracts;

import com.ozalp.sportcenter.business.dto.requests.CreateAthleteRequest;
import com.ozalp.sportcenter.common.utilities.results.Result;
import com.ozalp.sportcenter.entities.concretes.Athlete;

public interface AthleteService extends BaseService<Athlete> {

    Result create(CreateAthleteRequest request);

}
