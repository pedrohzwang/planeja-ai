package org.zwang.rest.vacation.model;

import lombok.Builder;

import java.util.UUID;

@Builder
public record VacationResponse(UUID id, String description, String destiny) {
}
