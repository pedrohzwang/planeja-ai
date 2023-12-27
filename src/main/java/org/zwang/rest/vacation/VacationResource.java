package org.zwang.rest.vacation;

import org.zwang.application.service.query.VacationQueryService;
import org.zwang.rest.vacation.model.VacationResponse;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.List;

@Path("v1/vacations")
public class VacationResource {

    @Inject
    private VacationQueryService vacationQueryService;

    @GET
    public List<VacationResponse> findAll() {
        return vacationQueryService.findAll();
    }

}
