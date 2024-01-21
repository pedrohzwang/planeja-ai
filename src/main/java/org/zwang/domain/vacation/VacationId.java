package org.zwang.domain.vacation;

import org.zwang.domain.common.Identity;

import java.util.UUID;

public class VacationId extends Identity<UUID> {

    public VacationId(UUID valor) {
        super(valor);
    }
}
