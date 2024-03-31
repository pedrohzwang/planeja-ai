package org.zwang.infrastructure.dao.dto;

import lombok.Builder;
import org.zwang.common.enumeration.EVacationTarget;
import org.zwang.common.enumeration.ETravelType;
import org.zwang.infrastructure.entity.VacationEntity;

import java.util.UUID;

@Builder
public record VacationDTO(UUID id, String description, String destiny, ETravelType type, EVacationTarget target) {

    public static VacationDTO fromEntity(VacationEntity entity) {
        return VacationDTO.builder()
                .id(entity.id())
                .description(entity.description())
                .destiny(entity.destiny())
                .type(entity.type())
                .target(entity.target())
                .build();
    }
}
