package com.ozalp.sportcenter.business.dto.requests.concretes;

import com.ozalp.sportcenter.business.dto.requests.abstracts.BaseRequest;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
public class CreateProgramRequest extends BaseRequest {

    private UUID athleteId;
    private UUID coachId;
    private String name;
    private LocalDate startDate;
    private LocalDate endDate;

}
