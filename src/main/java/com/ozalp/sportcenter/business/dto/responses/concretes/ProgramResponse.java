package com.ozalp.sportcenter.business.dto.responses.concretes;

import com.ozalp.sportcenter.business.dto.responses.abstracts.BaseResponse;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class ProgramResponse extends BaseResponse {

    private AthleteResponse athlete;
    private AthleteResponse coach;
    private String name;
    private LocalDate startDate;
    private LocalDate endDate;

}
