package org.zwang.rest.vacation.model;

import lombok.Builder;
import org.zwang.infrastructure.entity.VacationEntity;

import java.util.UUID;

@Builder
public record VacationResponse(UUID id, String description) {

    public static VacationResponse fromEntity(VacationEntity entity) {
        return VacationResponse.builder()
                .id(entity.id())
                .description(entity.description()).build();
    }
}
