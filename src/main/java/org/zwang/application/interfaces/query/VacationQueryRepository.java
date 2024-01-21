package org.zwang.application.interfaces.query;

import org.zwang.rest.vacation.model.vacation.VacationResponse;

import java.util.List;

public interface VacationQueryRepository {

    List<VacationResponse> listVacations();
}
