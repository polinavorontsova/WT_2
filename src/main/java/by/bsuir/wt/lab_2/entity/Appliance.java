package by.bsuir.wt.lab_2.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * Represent a single object of appliance
 */
@Getter
@AllArgsConstructor
@ToString(includeFieldNames = false)
public abstract class Appliance {
    /**
     * Cost of appliance.
     */
    protected final int cost;

    /**
     * Checking if the entity matches the criteria.
     *
     * @param criteriaField the criteria field name
     * @param value         value of criteria
     * @return true - if matched
     */
    public abstract boolean isApplianceMatchedCriteria(String criteriaField, Object value);
}
