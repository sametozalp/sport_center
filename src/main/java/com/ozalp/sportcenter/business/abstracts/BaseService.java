package com.ozalp.sportcenter.business.abstracts;

import com.ozalp.sportcenter.common.utilities.results.Result;

public interface BaseService<T> {

    Result create(T t);

    Result delete(T t);

}
