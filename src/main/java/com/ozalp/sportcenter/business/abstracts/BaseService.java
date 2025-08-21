package com.ozalp.sportcenter.business.abstracts;

import com.ozalp.sportcenter.business.dto.requests.BaseRequest;
import com.ozalp.sportcenter.business.dto.responses.BaseResponse;

public interface BaseService {

    BaseResponse create(BaseRequest request);

    BaseResponse delete(BaseRequest request);

    BaseResponse update(BaseRequest request);
}
