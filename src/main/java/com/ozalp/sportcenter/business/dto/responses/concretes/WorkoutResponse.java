package com.ozalp.sportcenter.business.dto.responses.concretes;

import com.ozalp.sportcenter.business.dto.responses.abstracts.BaseResponse;
import com.ozalp.sportcenter.entities.concretes.Program;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
public class WorkoutResponse extends BaseResponse {

    private UUID id;

    private Program program;

    private LocalDate date;

    private String name;

    private String notes;
}
