package com.ozalp.sportcenter.business.abstracts;

import com.ozalp.sportcenter.business.dto.responses.abstracts.BaseResponse;
import com.ozalp.sportcenter.common.utilities.results.DataResult;
import com.ozalp.sportcenter.common.utilities.results.Result;
import com.ozalp.sportcenter.common.utilities.results.SuccessDataResult;

import java.util.UUID;

public interface BaseService<T, R extends BaseResponse> {

    DataResult<R> create(T t);

    Result delete(T t);

    T getById(UUID id);

    DataResult<R> getDtoById(UUID id);

}
