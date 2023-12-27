package org.zwang.infrastructure.dao.dto;

import lombok.Builder;
import org.zwang.infrastructure.entity.VacationEntity;

import java.util.UUID;

@Builder
public record VacationDTO(UUID id, String description, String destiny) {

    public static VacationDTO fromEntity(VacationEntity entity) {
        return VacationDTO.builder()
                .id(entity.id())
                .description(entity.description())
                .destiny(entity.destiny())
                .build();
    }
}
