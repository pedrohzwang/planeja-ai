package org.zwang.application.service.domain;

import org.zwang.application.interfaces.domain.VacationRepository;
import org.zwang.domain.vacation.Vacation;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class VacationService {

    @Inject
    private VacationRepository vacationRepository;

    public void create(Vacation vacation) {
        vacationRepository.create(vacation);
    }
}
