package org.zwang.application.interfaces.domain;

import org.zwang.domain.vacation.Vacation;

import java.util.UUID;

public interface VacationRepository {

    public UUID create(Vacation vacation);

    public void update(Vacation vacation);
}
