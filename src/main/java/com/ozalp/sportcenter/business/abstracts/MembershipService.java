package com.ozalp.sportcenter.business.abstracts;

import com.ozalp.sportcenter.business.dto.requests.concretes.CreateMembershipRequest;
import com.ozalp.sportcenter.common.utilities.results.Result;
import com.ozalp.sportcenter.entities.concretes.Membership;

public interface MembershipService extends BaseService<Membership> {

    Result create(CreateMembershipRequest request);
}
