package com.ozalp.sportcenter.business.abstracts;

import com.ozalp.sportcenter.business.dto.requests.concretes.CreateMembershipPackageRequest;
import com.ozalp.sportcenter.business.dto.responses.concretes.MembershipPackageResponse;
import com.ozalp.sportcenter.common.utilities.results.Result;
import com.ozalp.sportcenter.entities.concretes.MembershipPackage;

public interface MembershipPackageService extends BaseService<MembershipPackage, MembershipPackageResponse> {

    Result create(CreateMembershipPackageRequest request);

}
