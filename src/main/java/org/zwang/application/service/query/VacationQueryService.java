package org.zwang.application.service.query;

import lombok.extern.jbosslog.JBossLog;
import org.zwang.application.interfaces.query.VacationQueryRepository;
import org.zwang.rest.vacation.model.VacationResponse;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
@JBossLog
public class VacationQueryService {

    @Inject
    private VacationQueryRepository vacationQueryRepository;

    public List<VacationResponse> findAll() {
        return vacationQueryRepository.listVacations();
    }
}
