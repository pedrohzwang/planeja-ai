package org.zwang.rest.vacation.model.vacation;

import lombok.Builder;
import org.zwang.common.enumeration.EVacationTarget;
import org.zwang.common.enumeration.ETravelType;

import java.time.LocalDate;
import java.util.UUID;

@Builder
public record VacationRequest(
        UUID id,
        String description,
        String destiny,
        LocalDate startDate,
        LocalDate endDate,
        ETravelType type,
        EVacationTarget target
) {
}
