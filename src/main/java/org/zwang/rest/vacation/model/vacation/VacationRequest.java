package org.zwang.rest.vacation.model.vacation;

import lombok.Builder;

import java.time.LocalDate;
import java.util.UUID;

@Builder
public record VacationRequest(
        UUID id,
        String description,
        String destiny,
        LocalDate startDate,
        LocalDate endDate
) {
}
