package org.zwang.infrastructure.repository.query;

import org.zwang.application.interfaces.query.VacationQueryRepository;
import org.zwang.infrastructure.dao.VacationDAO;
import org.zwang.rest.vacation.model.vacation.VacationResponse;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class VacationQueryRepositoryImpl implements VacationQueryRepository {

    @Inject
    private VacationDAO vacationDAO;

    @Override
    public List<VacationResponse> listVacations() {
        return vacationDAO.listVacations().stream()
                .map(dto ->
                        VacationResponse.builder()
                                .id(dto.id())
                                .description(dto.description())
                                .destiny(dto.destiny())
                                .build())
                .toList();
    }
}
