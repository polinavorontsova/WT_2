package by.bsuir.wt.lab_2.entity.criteria;

import java.util.HashMap;
import java.util.Map;

/**
 * The Appliance criteria class encapsulate all criteria.
 */
public class ApplianceCriteria {
    private final Map<String, Object> ALL_CRITERIA = new HashMap<>();
    private String applianceName;

    /**
     * Instantiates a new Appliance criteria.
     *
     * @param applianceName the appliance name
     */
    public ApplianceCriteria(String applianceName) {
        this.applianceName = applianceName;
    }

    /**
     * Instantiates a new Appliance criteria (No-arg constructor).
     */
    public ApplianceCriteria(){
    }

    /**
     * Add criteria.
     *
     * @param searchCriteria the search criteria name
     * @param value          value
     */
    public void addCriteria(String searchCriteria, Object value) {
        ALL_CRITERIA.put(searchCriteria, value);
    }

    /**
     * Gets appliance name.
     *
     * @return the appliance name
     */
    public String getApplianceName() {
        return applianceName;
    }

    /**
     * Gets criteria.
     *
     * @return the criteria
     */
    public Map<String, Object> getCriteria() {
        return new HashMap<>(ALL_CRITERIA);
    }
}
