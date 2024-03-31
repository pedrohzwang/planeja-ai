package org.zwang.infrastructure.entity;

import lombok.Builder;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Metamodel;
import org.seasar.doma.Table;
import org.seasar.doma.jdbc.entity.NamingType;
import org.zwang.common.enumeration.EVacationTarget;
import org.zwang.common.enumeration.ETravelType;
import org.zwang.domain.vacation.Vacation;

import java.time.LocalDate;
import java.util.UUID;

@Entity(immutable = true, metamodel = @Metamodel, naming = NamingType.SNAKE_LOWER_CASE)
@Table(name = "vacation")
@Builder
public record VacationEntity(
        @Id
        UUID id,
        String description,
        LocalDate startDate,
        LocalDate endDate,
        String destiny,
        ETravelType type,
        EVacationTarget target
) {

    public static VacationEntity of(Vacation vacation) {
        return VacationEntity.builder()
                .id(vacation.getId().identity())
                .description(vacation.getDescription())
                .startDate(vacation.getStartDate().getDate())
                .endDate(vacation.getEndDate().getDate())
                .destiny(vacation.getDestiny())
                .type(vacation.getType())
                .target(vacation.getTarget())
                .build();
    }
}
