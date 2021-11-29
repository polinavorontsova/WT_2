package by.bsuir.wt.lab_2.dao;

import by.bsuir.wt.lab_2.entity.Appliance;
import by.bsuir.wt.lab_2.entity.criteria.ApplianceCriteria;

/**
 * The interface of Appliance dao classes
 */
public interface ApplianceDao {

    /**
     * Finds all the appliances that match the given criteria.
     *
     * @param applianceCriteria search criteria for {@link Appliance}
     * @return all matched appliance
     */
    Appliance[] find(ApplianceCriteria applianceCriteria);
}
