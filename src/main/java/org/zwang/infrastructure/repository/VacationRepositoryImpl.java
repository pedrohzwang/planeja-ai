package org.zwang.infrastructure.repository;

import org.zwang.application.interfaces.domain.VacationRepository;
import org.zwang.domain.vacation.Vacation;
import org.zwang.infrastructure.dao.VacationDAO;
import org.zwang.infrastructure.entity.VacationEntity;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class VacationRepositoryImpl implements VacationRepository {

    @Inject
    private VacationDAO vacationDAO;

    @Override
    public void create(Vacation vacation) {
        vacationDAO.create(VacationEntity.of(vacation));
    }
}
