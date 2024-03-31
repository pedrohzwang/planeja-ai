package org.zwang.rest.vacation;

import org.zwang.application.service.domain.VacationService;
import org.zwang.application.service.query.VacationQueryService;
import org.zwang.domain.vacation.Vacation;
import org.zwang.rest.vacation.model.vacation.VacationRequest;
import org.zwang.rest.vacation.model.vacation.VacationResponse;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import java.util.Collections;
import java.util.List;

@Path("api/v1/vacations")
public class VacationResource {

    @Inject
    private VacationQueryService vacationQueryService;

    @Inject
    private VacationService vacationService;

    @GET
    public List<VacationResponse> findAll() {
//        return vacationQueryService.findAll();
        return Collections.emptyList();
    }

    @POST
    public void create(VacationRequest request) {
        vacationService.create(Vacation.fromCreateRequest(request));
    }

}
