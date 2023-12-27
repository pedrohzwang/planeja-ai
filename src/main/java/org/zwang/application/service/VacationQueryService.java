package org.zwang.application.service;

import lombok.extern.jbosslog.JBossLog;
import org.seasar.doma.jdbc.criteria.NativeSql;
import org.zwang.infrastructure.entity.VacationEntity_;
import org.zwang.rest.vacation.model.VacationResponse;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
@JBossLog
public class VacationQueryService {

    @Inject
    private NativeSql nativeSql;

    public List<VacationResponse> findAll() {
        VacationEntity_ vacationEntity = new VacationEntity_();
        var result = nativeSql.from(vacationEntity).select(vacationEntity).fetch();
        return result.stream().map(entity -> VacationResponse.fromEntity(entity)).toList();
    }
}
