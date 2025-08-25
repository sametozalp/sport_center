package com.ozalp.sportcenter.business.dto.requests.concretes;

import com.ozalp.sportcenter.business.dto.requests.abstracts.BaseRequest;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
public class CreateWorkoutRequest extends BaseRequest {

    private UUID programId;

    private LocalDate date;

    private String name;

    private String notes;
}
