package org.zwang.infrastructure.entity;

import lombok.Builder;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Metamodel;
import org.seasar.doma.Table;
import org.seasar.doma.jdbc.entity.NamingType;

import java.time.LocalDate;
import java.util.UUID;

@Entity(immutable = true, metamodel = @Metamodel, naming = NamingType.SNAKE_LOWER_CASE)
@Table(name = "vacation")
@Builder
public record VacationEntity(
        @Id UUID id,
        String description,
        LocalDate startDate,
        LocalDate endDate,
        String destiny
) {
}
