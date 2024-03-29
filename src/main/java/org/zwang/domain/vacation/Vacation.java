package org.zwang.domain.vacation;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.zwang.domain.common.Date;
import org.zwang.rest.vacation.model.vacation.VacationRequest;

import java.util.UUID;

@Builder
@Getter
@Setter
public class Vacation {

    private VacationId id;
    private String description;
    private Date startDate;
    private Date endDate;
    private String destiny;

    public static Vacation fromCreateRequest(VacationRequest request) {
        return Vacation.builder()
                .id(new VacationId(UUID.randomUUID()))
                .description(request.description())
                .destiny(request.destiny())
                .startDate(new Date(request.startDate()))
                .endDate(new Date(request.endDate()))
                .build();
    }
}
