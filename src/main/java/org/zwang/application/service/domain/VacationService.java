package org.zwang.application.service.domain;

import org.zwang.application.interfaces.domain.VacationRepository;
import org.zwang.domain.vacation.Vacation;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.UUID;

@ApplicationScoped
public class VacationService {

    @Inject
    private VacationRepository vacationRepository;

    public UUID create(Vacation vacation) {
        return vacationRepository.create(vacation);
    }

    public void update(Vacation vacation) {
        vacationRepository.update(vacation);
    }
}
