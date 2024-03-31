package org.zwang.rest.vacation.model.vacation;

import lombok.Builder;
import org.zwang.common.enumeration.ETravelType;
import org.zwang.common.enumeration.EVacationTarget;

import java.time.LocalDate;

@Builder
public record VacationRequest(
        String description,
        String destiny,
        LocalDate startDate,
        LocalDate endDate,
        ETravelType type,
        EVacationTarget target
) {
}
