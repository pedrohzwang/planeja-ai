package org.zwang.rest.vacation.model.vacation;

import lombok.Builder;
import org.zwang.common.enumeration.EVacationTarget;
import org.zwang.common.enumeration.ETravelType;

import java.util.UUID;

@Builder
public record VacationResponse(UUID id, String description, String destiny, ETravelType type, EVacationTarget target) {
}
