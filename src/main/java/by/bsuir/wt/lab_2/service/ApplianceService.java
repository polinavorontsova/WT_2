package by.bsuir.wt.lab_2.service;

import by.bsuir.wt.lab_2.entity.Appliance;
import by.bsuir.wt.lab_2.entity.criteria.ApplianceCriteria;

/**
 * The interface of an Appliance service.
 */
public interface ApplianceService {

    /**
     * Find all appliances that matched criteria.
     *
     * @param applianceCriteria criteria
     * @return all matched appliances
     */
    Appliance[] findByCriteria(ApplianceCriteria applianceCriteria);

}
