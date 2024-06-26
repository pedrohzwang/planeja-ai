package org.zwang.infrastructure.dao;

import org.seasar.doma.jdbc.criteria.Entityql;
import org.seasar.doma.jdbc.criteria.NativeSql;
import org.zwang.infrastructure.dao.dto.VacationDTO;
import org.zwang.infrastructure.entity.VacationEntity;
import org.zwang.infrastructure.entity.VacationEntity_;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;
import java.util.UUID;

@ApplicationScoped
public class VacationDAO {

    @Inject
    private NativeSql nativeSql;

    @Inject
    private Entityql entityql;

    public List<VacationDTO> listVacations() {
        VacationEntity_ vacationEntity = new VacationEntity_();
        var result = nativeSql.from(vacationEntity)
                .orderBy(vac -> vac.asc(vacationEntity.description))
                .select(vacationEntity)
                .fetch();
        return result.stream().map(entity -> VacationDTO.fromEntity(entity)).toList();
    }

    public UUID create(VacationEntity entity) {
        var saved = entityql.insert(new VacationEntity_(), entity).execute();
        return saved.component1().id();
    }

    public void update(VacationEntity entity) {
        entityql.update(new VacationEntity_(), entity).execute();
    }
}
