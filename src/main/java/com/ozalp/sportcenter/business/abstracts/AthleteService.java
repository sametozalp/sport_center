package com.ozalp.sportcenter.business.abstracts;

import com.ozalp.sportcenter.business.dto.requests.concretes.CreateAthleteRequest;
import com.ozalp.sportcenter.business.dto.responses.AthleteResponse;
import com.ozalp.sportcenter.common.utilities.results.Result;
import com.ozalp.sportcenter.entities.concretes.Athlete;

public interface AthleteService extends BaseService<Athlete, AthleteResponse> {

    Result create(CreateAthleteRequest request);

}
