package com.ozalp.sportcenter.business.abstracts;

import com.ozalp.sportcenter.common.utilities.results.DataResult;
import com.ozalp.sportcenter.common.utilities.results.Result;
import com.ozalp.sportcenter.common.utilities.results.SuccessDataResult;

import java.util.UUID;

public interface BaseService<T> {

    Result create(T t);

    Result delete(T t);

    T getById(UUID id);


}
