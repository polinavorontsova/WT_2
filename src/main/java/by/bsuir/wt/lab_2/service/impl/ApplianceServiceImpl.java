package by.bsuir.wt.lab_2.service.impl;

import by.bsuir.wt.lab_2.dao.DaoFactory;
import by.bsuir.wt.lab_2.entity.Appliance;
import by.bsuir.wt.lab_2.entity.criteria.ApplianceCriteria;
import by.bsuir.wt.lab_2.service.ApplianceService;
import by.bsuir.wt.lab_2.service.validation.Validator;

/**
 * The type Appliance service.
 */
public class ApplianceServiceImpl implements ApplianceService {

    @Override
    public Appliance[] findByCriteria(ApplianceCriteria applianceCriteria) {
        if (!Validator.isCriteriaValid(applianceCriteria)) {
            throw new IllegalArgumentException("Criteria is not valid");
        }

        return DaoFactory.getInstance().getApplianceDAO().find(applianceCriteria);
    }
}